import java.util.*;
public class Applikation {
    public static void main(String[] args) {
		
		while (true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("> What number would you like to convert?");
			System.out.print("> ");
		
			String input = scanner.nextLine();
			try { 
				Integer.parseInt(input); 
			}  catch (NumberFormatException e){ 
				System.out.println("> " + input + " is not a valid integer."); 
				System.exit(1);
			} 
			int number = Integer.parseInt(input);
			
			System.out.println("\n> " + input + " as a binary number:");
			Barcode.convertToBinary(number);
			
			input = "";
			while (!input.equals("n") && !input.equals("y")){
				System.out.println();
				System.out.println("> Do you want to convert another number to binary (y/n)?");
				System.out.print("> ");
				input = scanner.nextLine();
				if (input.equals("n")){
					System.exit(0);
				} else if (input.equals("y")){
					System.out.println();
					break;
				}
			}
		}
    }
}
