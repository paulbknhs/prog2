import java.lang.*;
public class Bierfass implements Fass{
	
	public String content = null;
	
	public int height;
	public int diameter;
	
	public String getContent(){
		return this.content;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int getDiameter(){
		return this.diameter;
	}
	
	public void setContent(String content){
		this.content = content;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public void setDiameter(int diameter){
		this.diameter = diameter;
	}
	
	public Bierfass(int height, int diameter){
		this.height = height;
		this.diameter = diameter;
	}
	
	public double getVolume(){
		
		return Math.PI * Math.pow(diameter/2, 2);
	}
	
	@Override
	public String toString(){
		return String.format("Bierfass mit %d/%d (H/Durchm. in mm)) und einem Volumen von %.0f mm^2", this.getHeight(), this.getDiameter(), this.getVolume());
	}
}	