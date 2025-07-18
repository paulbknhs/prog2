import java.awt.Color;
public class Applikation{

	public static void main(String[] args){
		
		Auto postauto = new Auto(0);
		System.out.println(postauto);	//toString() of Auto has to be overridden because println uses toString();
		
		/*
		this is the anonymus class part:
			+ create a new Auto.
			+ add the curly brackets.
			+ everything in the brackets automaticly extends the Auto class!!!
			+ Syntax: new Auto(80){stuff};

			(anonymus classes are like "one use" classes)
		*/
		postauto = new Auto(80){

			Color color = Color.yellow;

			@Override
			public String toString(){
				//use toString() from original class and just add the rest to it
				return super.toString() + " und Farbe " + this.color;
			}
		};

		System.out.println(postauto);
	}
}
