public class Vehicle implements Moveable{

    private String color;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String move() {
        return "Vehicle moved";
    }
}