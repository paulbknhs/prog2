import java.util.Arrays;

public class VehicleManagement {

  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[args.length];
    for (int i = 0; i < args.length; i++) {
      vehicles[i] = new Vehicle(args[i]);
    }

    for (Vehicle v : vehicles) {
      System.out.print(v.toString());
    }
    System.out.println();
    Arrays.sort(vehicles);
    for (Vehicle v : vehicles) {
      System.out.print(v.toString());
    }
    System.out.println();
  }

}
