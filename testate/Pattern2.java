import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    var scan = new Scanner(System.in);
    System.out.print("Size: ");
    int height = scan.nextInt();
    for (int i = height; i > 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        System.out.print(' ');
      }
      for (int k = i; k <= height; k++) {
        System.out.print('*');
      }
      System.out.println();
    }
    scan.close();
  }
}
