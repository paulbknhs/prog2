public class Main {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      if (i % 3 == 0)
        consumer(new Vehicle(args[i]));
      if (i % 3 == 1)
        consumer(new Truck(args[i]));
      if (i % 3 == 2)
        consumer(new Cube());
    }
  }

  public static void consumer(Object o) {
    if (o instanceof Moveable) {
      Moveable m = (Moveable) o;
      System.out.println(m.move());
    }
    if (o instanceof Vehicle) {
      Vehicle v = (Vehicle) o;
      System.out.println(v.getColor());
    }
    if (o instanceof Truck) {
      Truck t = (Truck) o;
      System.out.println(t.getLoad());
    }

    // TODO
  }
}
