package entity;

public class NPC{

  public int xCoordinate;
  public boolean isCrouching;

  public NPC() {
    this.xCoordinate = 0;
    this.isCrouching = false;
  }

  public void standUp() {
    this.isCrouching = false;
  }

  public void crouch() {
    this.isCrouching = true;
  }

  public void walkRight() {
    this.xCoordinate++;
  }

  public void dashRight() {
    if (this.isCrouching == false) {
      this.xCoordinate += 2;
    }
  }
}
