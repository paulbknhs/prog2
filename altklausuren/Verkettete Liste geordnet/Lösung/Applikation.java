import java.util.*;

public class Applikation{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List list = new List (null);
		while (true){
			System.out.println(">Aktuelle Liste: " + list.output(list.head));	
			System.out.print(">Weiteres Element: ");
			list.add(scanner.nextLine());
		}
	}
}