public class Haus implements Comparable <Haus>{
	
	int hoehe;
	
	public int getHoehe(){
		return this.hoehe;
	}
	
	public void setHoehe(int hoehe){
		this.hoehe = hoehe;
	}
	
	public Haus(int hoehe){
		this.hoehe = hoehe;
	}
	
	@Override
	public int compareTo(Haus h){
		
		if(!(h instanceof Haus)){
			throw new ClassCastException() ;
		}
		
		if(this.getHoehe() < h.getHoehe()){
			return -1;
		}else if (this.getHoehe() == h.getHoehe()){
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString(){
		return ("Haus mit Hoehe " + this.getHoehe());
	}
}