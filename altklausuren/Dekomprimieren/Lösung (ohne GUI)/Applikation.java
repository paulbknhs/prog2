import java.util.*;

public class Applikation{
	public static void main(String[] args) {
		
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Komprimierte Zeichenfolge:");
			String input = scanner.nextLine();
			System.out.println();
			
			DecompressedText decompressed = new DecompressedText();
			decompressed.setText(input);
			decompressed.compressText();
			
			System.out.println("Dekomprimierte Zeichenfolge:");
			System.out.println(decompressed.toString());
			System.out.println();
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("Wollen Sie noch einen Text dekomprimieren (j/n)?");
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