package game;

import java.lang.Thread;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.List;
import entity.NPC;

public class GameView {

  NPC player;
  GameObjects.GameObject[][] view;

  public GameView() {
    this.view = new GameObjects.GameObject[20][3];
    this.player = new NPC();
    List<Integer> lavaTilesX = Arrays.asList(4, 8, 12, 16);
    List<Integer> obstacleTilesX = Arrays.asList(2, 6, 10, 14, 18);

    for (int x = 0; x < 20; x++) {
      for (int y = 0; y < 3; y++) {
        switch (y) {
          case 0:
            if (lavaTilesX.contains(x)) {
              this.view[x][y] = GameObjects.GameObject.LAVA;
            } else if (x == 19) {
              this.view[x][y] = GameObjects.GameObject.GOAL;
            } else {
              this.view[x][y] = GameObjects.GameObject.GROUND;
            }
            break;
          case 1:
            this.view[x][y] = GameObjects.GameObject.EMPTY;
            break;
          case 2:
            if (obstacleTilesX.contains(x)) {
              this.view[x][y] = GameObjects.GameObject.AIROBSTACLE;
            } else {
              this.view[x][y] = GameObjects.GameObject.EMPTY;
            }
            break;
        }
      }
    }
  }

  public String str() {
    StringBuilder str = new StringBuilder(60);

    for (int y = 2; y >= 0; y--) {
      for (int x = 0; x <= 19; x++) {
        if (x == this.player.xCoordinate) {
          if (!player.isCrouching && (y == 2 || y == 1)) {
            str.append('P');
          } else if (player.isCrouching && y == 1) {
            str.append('P');
          } else {
            str.append(this.view[x][y].getSymbol());
          }
        } else {
          str.append(this.view[x][y].getSymbol());
        }
      }
      str.append('\n');
    }

    return str.toString();
  }

  public void play() {
    while (true) {
      System.out.println(this.str());

      GameObjects.GameObject currentTile = this.view[player.xCoordinate][0];
      if (currentTile == GameObjects.GameObject.LAVA) {
        break;
      } else if (currentTile == GameObjects.GameObject.GOAL) {
        System.out.println("NPC hat das Ziel erreicht. Spiel beendet!");
        break;
      }

      boolean hasNext = player.xCoordinate + 1 < 20;
      if (hasNext) {
        GameObjects.GameObject tileAheadLow = this.view[player.xCoordinate + 1][0];
        GameObjects.GameObject tileAheadHigh = this.view[player.xCoordinate + 1][2];

        if (tileAheadHigh == GameObjects.GameObject.AIROBSTACLE && !player.isCrouching) {
          
          player.isCrouching = true;
        } else if (tileAheadLow == GameObjects.GameObject.LAVA && !player.isCrouching) {
          
          player.dashRight();
        } else if (tileAheadLow == GameObjects.GameObject.LAVA && player.isCrouching) {
          player.isCrouching = false;
        } else {
          GameObjects.GameObject tileAboveNext = this.view[player.xCoordinate + 1][2];
          if (tileAheadLow == GameObjects.GameObject.LAVA && player.isCrouching) {
            if (tileAboveNext != GameObjects.GameObject.AIROBSTACLE) {
              player.isCrouching = false;
            }
          }

          player.xCoordinate++;
        }
      }

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    GameView game = new GameView();
    game.play();
  }
}
