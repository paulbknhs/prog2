import model.Tree;

public class Main {
  public static void main(String[] args) {
    // Tree 1
    Tree tree1 = new Tree(10);
    tree1.insertValue(5);
    tree1.insertValue(15);
    tree1.insertValue(3);
    tree1.insertValue(7);
    tree1.insertValue(12);
    tree1.insertValue(17);

    System.out.println("Tree 1: " + tree1.str());
    System.out.println("Tree 1 Contains 7? " + tree1.contains(7)); // true
    System.out.println("Tree 1 Contains 20? " + tree1.contains(20)); // false

    tree1.deleteValue(15);
    System.out.println("Tree 1 After Deleting 15: " + tree1.str());

    // Tree 2
    Tree tree2 = new Tree(50);
    tree2.insertValue(30);
    tree2.insertValue(70);
    tree2.insertValue(20);
    tree2.insertValue(40);
    tree2.insertValue(60);
    tree2.insertValue(80);

    System.out.println("\nTree 2: " + tree2.str());
    System.out.println("Tree 2 Contains 40? " + tree2.contains(40)); // true

    tree2.deleteValue(30);
    System.out.println("Tree 2 After Deleting 30: " + tree2.str());

  }
}
