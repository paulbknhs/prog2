import java.util.Queue;

public class ArrayQueue {
  public static void main(String[] args) {
    if (args.length == 1) {
      try {
        int[] queue = init(Integer.parseInt(args[0]));
        printQueue(queue);
      } catch (NumberFormatException e) {
        System.out.println(String.format("Error Parsing %s", args[0]));
      }
      return;
    }

    // Testausgabe für Studenten dies dürfen Sie nach Bedarf verändern
    int[] queue = init(5);
    printQueue(queue);
  }

  public static int[] init(int length) {
    int[] queue = new int[length];
    for (int i = 0; i < length; i++) {
      queue[i] = -1;
    }
    return queue;
  }

  public static void printQueue(int[] queue) {
    System.out.print("[");
    for (int i = 0; i < queue.length; i++) {
      if (i == queue.length - 1) {
        System.out.print(queue[i]);
      } else {
        System.out.print(queue[i] + ", ");
      }
    }
    System.out.print("]");
  }

}
