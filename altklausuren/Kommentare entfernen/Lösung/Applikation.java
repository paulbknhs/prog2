import java.util.*;

public class Applikation{
	public static void main(String[] args) {
		
		while (true){
			System.out.println("Unformatierte Eingabe (zum Formatieren \"stop\" eingeben):");
			ArrayList<String> text = new ArrayList<String>();
			Scanner scanner = new Scanner(System.in);
			String input = "";
			
			while(true){
				input = scanner.nextLine();
				if(input.equals("stop")){
					break;
				}else{
					text.add(input);
				}
			}
			
			System.out.println("\nFormatierte Ausgabe:");
			text = FormattedText.formatText(text);
			
			for(int i = 0; i < text.size(); i++){
				System.out.println(text.get(i));
			}
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("\nWollen Sie noch einen Text formatieren (j/n)?");
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