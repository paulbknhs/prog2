public class Pattern2 {
  public static void main(String[] args) {
    Integer height = Integer.parseInt(args[0]);
    for (int i = height; i > 0; i--) {
      for (int j = i - 1; j >= 0; j--) {
        System.out.print(' ');
      }
      for (int k = i; k <= height; k++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
