import java.lang.*;
public class Point{
	
	public int x;
	public int y;
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int manhattanDistanceFromZero(){
		return Math.abs(this.getX()) + Math.abs(this.getY());
	}
	
	public boolean isMoreEastMoreNorth(Point o){
		if(this.getX() > o.getX()){
			return true;
		} else if (this.getX() == o.getX()){
			if(this.getY() > o.getY()){
				return true;
			} else{
				return false;
			}
		} else{
			return false;
		}
	}
	
	@Override
	public String toString(){
		return String.format("(%d,%d)", this.getX(), this.getY());
	}
}	