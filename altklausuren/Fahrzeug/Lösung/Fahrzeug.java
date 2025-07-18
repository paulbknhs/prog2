public abstract class Fahrzeug {	

	int gewicht;
	
	public int getGewicht(){
		return this.gewicht;
	}
	
	public void setGewicht(int gewicht){
		this.gewicht = gewicht;
	}
	
	public Fahrzeug(int gewicht){
		this.gewicht = gewicht;
	}
	
	public boolean istSchwerer(Fahrzeug f){
		if(this.getGewicht() > f.getGewicht()){
			return true;
		} else{
			return false;
		}
	}
}