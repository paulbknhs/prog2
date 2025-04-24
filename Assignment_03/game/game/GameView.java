package game;

import java.lang.StringBuilder;
import GameObject;
import entity.NPC;

public class GameView {
  GameObjects[][] view;

  public GameView() {
    this.view = new GameObjects[20][3];
  }

  public str() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < view.length; i++) {
      for (int j = 0; j < view[i].length; j++) {
        if (view[i][j] != null) {
          sb.append(view[i][j].toString());
        } else {
          sb.append(" ");
        }
      }
      sb.append("\n");
    }
    return sb.toString();
  }
}
