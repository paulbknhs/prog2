package game;

import game.GameObject;
import entity.NPC;

public class GameView {
  GameObjects[][] view;

  public GameView() {
    this.view = new GameObjects[20][3];
  }
}
