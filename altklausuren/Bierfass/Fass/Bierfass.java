import java.math.*;
public class Bierfass implements Fass {
    private double height;
    private double diameter;
    private String content;
    
    public Bierfass(double height, double diameter, String content) {
        this.height = height;
        this.diameter = diameter;
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public double getVolume() {
        return Math.floor(0.25 * Math.PI * this.diameter * this.diameter * this.height);
    }

    @Override
    public String toString() {
        return "Content: " + this.getContent() + " Volume: " + this.getVolume() + "mm³";
    }
}
