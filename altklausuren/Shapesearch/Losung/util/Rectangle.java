package Losung.util;

public class Rectangle implements Shape{
	
	public int length;
	public int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	public int getLength(){
		
		return this.length;
	}
	
	public int getWidth(){
		
		return this.width;
	}
	
	public void setLength(int length){
		
		this.length = length;
	}
	
	public void setWidth(int width){
		
		this.width = width;
	}
	
	public int getSurfaceArea(){
		
		return this.length * this.width;
	}
	
	@Override
	public String toString(){
		String s = String.format("Rect(%d,%d)", this.length, this.width);
		return s;
	}
}	