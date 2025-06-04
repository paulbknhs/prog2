public class Vehicle implements Comparable<Vehicle> { // TODO

  private String name;

  public Vehicle(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }

  @Override
  public int compareTo(Vehicle v) {
    String name1 = this.name;
    String name2 = v.toString();
    return name1.compareTo(name2);
  }
}
