public class Hund extends Haustier{
	
	int height;
	
	public Hund(String name, int height){
		super(name);
		this.height = height;
	}
	
	public int getHeight(){
		
		return this.height;
	}
	
	public void setLength(int height){
		
		this.height = height;
	}

	@Override
	public String toString(){
		String s = String.format("Hund %s %d", this.name, this.height);
		return s;
	}
}	