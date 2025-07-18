import java.util.Scanner;

public class Applikation
{
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true){
			
			System.out.print(">Eingabe: ");
			String input = scanner.nextLine();
			Generator pw = new Generator(input);
			System.out.println(">Ausgabe: " + pw.toString());
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.print(">nochmal? (j/n): ");
				input = scanner.nextLine();
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