package game;

public class GameObjects {

  enum GameObject {
    GROUND,
    LAVA,
    AIROBSTACLE,
    EMPTY,
    GOAL;

    public char getSymbol() {
      switch (this) {
        case GROUND:
          return 'G';
        case LAVA:
          return 'L';
        case AIROBSTACLE:
          return 'O';
        case EMPTY:
          return ' ';
        case GOAL:
          return 'Z';
        default:
          throw new IllegalArgumentException();
      }
    }
  }
}
