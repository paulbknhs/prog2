public class Applikation{
	public static void main(String[] args) {
		
		while (true){
			
			System.out.println("Wie lautet der Text, der formatiert werden soll?");
			System.out.print(">");
			String input = TextInput.readLine();
			FormattedText format = new FormattedText();
			format.setText(input);
			
			System.out.println("Wie viele Zeichen sollen pro Zeile angezeigt werden?");
			System.out.print(">");
			input = TextInput.readLine();
			
			try { 
				Integer.parseInt(input); 
			}  catch (NumberFormatException e){ 
				System.out.println(input + " ist keine valide Zahl."); 
				System.exit(1);
			} 
			int number = Integer.parseInt(input);
			
			format.justifyText(number);
			
			System.out.println("Blocksatz:\n");
			System.out.println(format.toString());
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println("Wollen Sie noch einen Text formatieren (j/n)?");
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