/* Es soll ein Tannenbaum auf der Konsole ausgegeben werden, sodass
 * bei eingabe 5 folgendes angezeigt wird:
 *
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *     *
 *
 * */

public class Tree {

  public static void main(String[] args) {
    int height = Integer.parseInt(args[0]);
    for (int i = 1; i <= height; i++) {
      for (int j = 0; j < height - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < height - 1; i++) {
      System.out.print(" ");
    }
    System.out.println("*");
  }
}
