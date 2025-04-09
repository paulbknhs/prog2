public class IntList {
  public static void main(String[] args) {
    int test1 = 123;
    int test2 = 5678;
    int test3 = 81827477;

    System.out.println(test1);
    System.out.println(countNumbers(test1));
    System.out.println(test2);
    System.out.println(countNumbers(test2));
    System.out.println(test3);
    System.out.println(countNumbers(test3));

  }

  public static int countNumbers(int num) {
    int count = 0;
    while ((int) (num / 10) > 0) {
      count++;
      System.out.println(num);
      num = (int) num / 10;
      System.out.println(num);
    }
    return count;
  }

}
