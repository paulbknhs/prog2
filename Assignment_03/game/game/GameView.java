package game;

import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.List;

import GameObjects.GameObject;
import game.GameObjects;
import entity.NPC;

public class GameView {

  GameObjects.GameObject[][] view;

  public GameView() {
    this.view = new GameObjects.GameObject[20][3];
    NPC player = new NPC();
    List<Integer> lavaTilesX = Arrays.asList(4, 8, 12, 16);
    List<Integer> obstacleTilesX = Arrays.asList(2, 6, 10, 14, 18);
    int goalX = 19;

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
          case 1:
            this.view[x][y] = GameObjects.GameObject.EMPTY;
          case 2:
            if (obstacleTilesX.contains(x)) {
              this.view[x][y] = GameObjects.GameObject.AIROBSTACLE;
            } else {
              this.view[x][y] = GameObjects.GameObject.EMPTY;
            }
        }
      }
    }
  }

  public String str() {

  }
}
