import java.util.Scanner;

public class TextInput{
	public static String readLine(){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
}