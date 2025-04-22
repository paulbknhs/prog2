package aufgabe3.data;

import java.lang.Math;

// This class is representing a cartesian coordinate in a 2d space with double coordinates.
public class DebugData {
    private double x;
    private double y;
    
  // int instead of double
    public DebugData(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(DebugData other) {
    // hier fehlt die sqrt
        return Math.sqrt(Math.pow(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2)));
    }
    
    public double getX(){
        return this.x;
    }
    
  // getY gibt x statt y zurück
    public double getY(){
        return this.x;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public String str() {
        return String.format("(%g, %g)", this.x, this.y);
    }
}
