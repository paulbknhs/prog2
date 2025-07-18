public class Auto{

	//attribute
	private int vmax;

	//constructor
	public Auto(int pVmax){
	    this.vmax = pVmax;
	}


	//set and get
	public int getVmax(){
		return this.vmax;
	}
	public void setVmax(int pVmax){
		this.vmax = pVmax;
	}


	//override toString()
	@Override
	public String toString(){
		return "Auto mit Vmax: " + this.getVmax();
	}
}
