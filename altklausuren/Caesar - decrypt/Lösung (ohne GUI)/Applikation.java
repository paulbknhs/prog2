import java.util.*;

public class Applikation{
	public static void main(String[] args) {
		
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Was ist der verschluesselte Text? (nur Grossbuchstaben)");
			String text = scanner.nextLine();
			
			for(int i = 0; i < text.length(); i++){
				if(!((text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') || text.charAt(i) == ' ')){
					System.out.println(text + " ist kein valider Text."); 
					System.exit(1);
				}
			}
			
			System.out.println();
			
			System.out.println("Was ist der Schluessel mit dem zuvor verschluesselt wurde? (ganze Zahl)");
			String keystr = scanner.nextLine();
			try { 
				Integer.parseInt(keystr); 
			}  catch (NumberFormatException e){ 
				System.out.println(keystr + " ist kein valider Integer."); 
				System.exit(1);
			} 
			int key = Integer.parseInt(keystr);
			
			System.out.println("\nEntschluesselter Text:");
			System.out.println(CDecrypt.decrypt(text, key));
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