public class Truck extends Vehicle{

    private String load = "No load";

    public Truck(String color) {
        super(color);
    }
    
    public String getLoad() {
        return load;
    }
}