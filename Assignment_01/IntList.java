public class IntList {
  public static void main(String[] args) {
    int test1 = 123;
    int test2 = 5678;
    int test3 = 81827477;

    System.out.println("Test cases:");
    System.out.println(test1);
    System.out.println(countNumbers(test1));
    System.out.println(test2);
    System.out.println(countNumbers(test2));
    System.out.println(test3);
    System.out.println(countNumbers(test3));

    int testnumber = 9999;
    System.out.println("Test number:");
    System.out.println(testnumber);
    int[] testlist = intToList(testnumber);
    for (int i = 0; i < testlist.length; i++) {
      System.out.print("[" + testlist[i] + "]");
    }
    System.out.println();
    testlist = addOne(testlist);
    for (int i = 0; i < testlist.length; i++) {
      System.out.print("[" + testlist[i] + "]");
    }
    System.out.println();
    int newnumber = listToInt(testlist);
    System.out.println(newnumber);
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

  public static int[] reverseList(int[] list) {
    int[] reversed = new int[list.length];
    for (int i = 0; i < list.length; i++) {
      reversed[i] = list[list.length - 1 - i];
    }
    return reversed;
  }

  public static int[] intToList(int num) {
    int count = countNumbers(num);
    int[] list = new int[count];
    for (int i = 0; i < count; i++) {
      list[i] = num % 10;
      num = (int) num / 10;
    }
    return reverseList(list);
  }

  public static int listToInt(int[] list) {
    int num = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] == 0) {
        num *= 10;
      } else {
        num += list[i] * Math.pow(10, i);
      }
    }
    return num;
  }

  public static int[] addOne(int[] numbers) {
    return intToList(listToInt(numbers) + 1);
  }
}
