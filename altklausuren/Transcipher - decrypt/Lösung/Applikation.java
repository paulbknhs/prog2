import java.util.*;

public class Applikation {

    public static void main(String[] args) {
        
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Was ist der chriffrierte Text?");
			String text = scanner.nextLine();
			
			System.out.println();
			
			System.out.println("Was ist der Grad mit dem verschlüsselt wurde? (ganze Zahl)");
			String degreestr = scanner.nextLine();
			try { 
				Integer.parseInt(degreestr); 
			}  catch (NumberFormatException e){ 
				System.out.println(degreestr + " ist kein valider Integer."); 
				System.exit(1);
			} 
			int degree = Integer.parseInt(degreestr);
			//text = "Jaeaa stvTt#";
			//degree = 3;
			DecryptString.decryptString(text, degree);
			System.out.println();
			
			String input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("Wollen Sie noch einen Text entschluesseln? (j/n)");
				input = scanner.nextLine();
				if (input.equals("n")){
					System.exit(0);
				} else if (input.equals("j")){
					System.out.println();
					break;
				}
			}
		}
    }
}