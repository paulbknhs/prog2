public class Applikation{
	public static void main(String[] args) {
		
		while (true){
			
			System.out.println("Geben sie einen Satz ein, der formatiert werden soll:");
			System.out.print(">");
			String input = TextInput.readLine();
			FormattingText format = new FormattingText();
			format.setText(input);
			
			System.out.println("Anzahl an Zeichen pro Zeile:");
			System.out.print(">");
			input = TextInput.readLine();
		
			try { 
				Integer.parseInt(input); 
			}  catch (NumberFormatException e){ 
				System.out.println(input + " ist keine valide Zahl."); 
				System.exit(1);
			} 
			int number = Integer.parseInt(input);
			
			format.alignRight(number);
			
			System.out.println("rechtsbündig:\n");
			System.out.println(format.toString());
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("Wollen Sie noch einen Satz formatieren (j/n)?");
				System.out.print(">");
				input = TextInput.readLine();
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