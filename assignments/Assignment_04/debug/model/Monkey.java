package debug.model;

import debug.Animal;

public class Monkey extends Animal {
  public Monkey(String name) {
    super(name);
  }


  @Override
  public String getName() {
    // Didnt use getName but tried accessing private field
    return super.getName();
  }

  @Override
  public int getArms() {
    return 2;
  }

  @Override
  public int getLegs() {
    return 2;
  }

  @Override
  public String toString() {
    return String.format("%s is a monkey with %d legs and %d arms.", this.getName(), this.getLegs(), this.getArms());
  }
}