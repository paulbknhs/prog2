import java.util.*;

public class Applikation{
	public static void main(String[] args) {
		
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dekomprimierte Zeichenfolge:");
			String input = scanner.nextLine();
			System.out.println();
			
			CompressedText compressed = new CompressedText();
			compressed.setText(input);
			compressed.compressText();
			
			System.out.println("Komprimierte Zeichenfolge:");
			System.out.println(compressed.toString());
			System.out.println();
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("Wollen Sie noch einen Text komprimieren (j/n)?");
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