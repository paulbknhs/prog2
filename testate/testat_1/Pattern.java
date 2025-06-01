import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("input: ");
    int size = scanner.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    scanner.close();
  }
}
