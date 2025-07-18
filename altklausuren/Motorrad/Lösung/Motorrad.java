public class Motorrad {	

	double leistung;
	int gewicht;
	String typname;
	
	public double getLeistung(){
		return this.leistung;
	}
	
	public int getGewicht(){
		return this.gewicht;
	}
	
	public String getTypname(){
		return this.typname;
	}
	
	public void setLeistung(double leistung){
		this.leistung = leistung;
	}
	
	public void setGewicht(int gewicht){
		this.gewicht = gewicht;
	}
	
	public void setTypname(String typname){
		this.typname = typname;
	}
	
	public Motorrad(double leistung, int gewicht, String typname){
		this.leistung = leistung;
		this.gewicht = gewicht;
		this.typname = typname;
	}
	
	@Override
	public String toString(){
		return String.format("Typ: %s, Gewicht: %d kg, Leistung: %.2f PS.", this.getTypname(), this.getGewicht(), this.getLeistung()); 
	}
}