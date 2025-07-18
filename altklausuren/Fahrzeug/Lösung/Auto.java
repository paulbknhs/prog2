public class Auto extends Fahrzeug implements Quartett{	
	
	public Auto(int gewicht){
		super(gewicht);
	}
	
	@Override
	public String toString(){
		return String.format("Auto mit Gewicht: %d kg", this.getGewicht()); 
	}
}