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

    intToList(999);
  }

  public static int countNumbers(int num) {
    int count = 1;
    while ((int) (num / 10) > 0) {
      count++;
      // System.out.println(num);
      num = (int) num / 10;
      // System.out.println(num);
    }
    return count;
  }

  public static int[] intToList(int value) {
    int[] valueArray = new int[countNumbers(value)];
    for (int i = 0; i < countNumbers(value); i++) {
      if (value > 9) {
        valueArray[i] = value % 10;
        value = (int) value / 10;
      } else {
        valueArray[i] = value;
      }
      System.out.print("[" + valueArray[i] + "]");
    }
    System.out.println("");
    return valueArray;
  }

}
