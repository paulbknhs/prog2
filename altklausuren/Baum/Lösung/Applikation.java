import java.util.*;

public class Applikation{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Tree tree = new Tree (null);
		while (true){
			System.out.println(">Aktueller Baum: " + tree.inOrder(tree.root));	
			System.out.print(">Weiteres Element: ");
			tree.add(scanner.nextLine());
		}
	}
}