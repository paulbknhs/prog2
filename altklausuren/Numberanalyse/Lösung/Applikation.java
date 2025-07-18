public class Applikation{
	public static void main(String[] args) {

		while (true){
			
			System.out.println(">What does your sequence look like?");
			System.out.print(">");
			
			String input = TextInput.readLine();
			NumberAnalyser output = new NumberAnalyser();
			output.setSequence(input);
			output.analyseSequence();
			System.out.println();
			
			System.out.println(">Output:");
			System.out.println(output.toString());
			
			input = "";
			while (!input.equals("n") && !input.equals("y")){
				System.out.println();
				System.out.println(">Do you want to analyse another sequence (y/n)?");
				System.out.print(">");
				input = TextInput.readLine();
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