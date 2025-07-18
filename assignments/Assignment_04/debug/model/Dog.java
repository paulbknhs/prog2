package debug.model;

// Missing import
import debug.Animal;

public class Dog extends Animal{
    
  public Dog(String name) {
    super(name);
  }


  @Override
  public String getName() {
    // Didnt use getName but tried accessing private field
    return super.getName();
  }

  @Override
  public int getArms() {
    // Dog no arms
    return 0;
  }

  @Override
  public int getLegs() {
    return 4;
  }

  @Override
  public String toString() {
    // arms and legs swapped
    return String.format("%s is a dog with %d legs and %d arms.", this.getName(), this.getLegs(),this.getArms() );
  }
}