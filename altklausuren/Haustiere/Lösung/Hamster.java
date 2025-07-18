public class Hamster extends Haustier{
	
	int speed;
	
	public Hamster(String name, int speed){
		super(name);
		this.speed = speed;
	}
	
	public int getSpeed(){
		
		return this.speed;
	}
	
	public void setLength(int speed){
		
		this.speed = speed;
	}

	@Override
	public String toString(){
		String s = String.format("Hamster %s %d", this.name, this.speed);
		return s;
	}
}	