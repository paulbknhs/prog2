public class Applikation{
	public static void main(String[] args) {

		while (true){
			
			System.out.println(">Wie lautet Ihre Eingabe? ");
			System.out.print(">");
			
			String input = TextInput.readLine();
			TextAnalyser output = new TextAnalyser();
			output.setText(input);
			output.analyseText();
			System.out.println();
			
			System.out.println("Ausgabe: ");
			System.out.println(output.toString());
			
			input = "";
			while (!input.equals("n") && !input.equals("j")){
				System.out.println();
				System.out.println("Wollen Sie noch einen Text analysieren (j/n)?");
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