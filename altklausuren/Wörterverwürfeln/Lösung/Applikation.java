import java.util.Scanner;

public class Applikation{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true){
			
			System.out.println(">Eingabe: ");
			String input = scanner.nextLine();
			PermutateWords output = new PermutateWords(input);
			System.out.println(">Ausgabe: ");
			System.out.println(output.toString());
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("\n\n>nochmal? (j/n)");
				System.out.print (">");
				input = scanner.nextLine();
				System.out.println();
				if (input.equals("n")){
					scanner.close();
					System.exit(0);
				} else if (input.equals("j")){
					break;
				}
			}
		}
	}
}