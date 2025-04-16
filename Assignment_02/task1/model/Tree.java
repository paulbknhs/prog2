package model;

public class Tree {

  private int value;
  private Tree left;
  private Tree right;

  public Tree(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Tree getLeft() {
    return this.left;
  }

  public void setLeft(Tree left) {
    this.left = left;
  }

  public Tree getRight() {
    return this.right;
  }

  public void setRight(Tree right) {
    this.right = left;
  }

  public String str() {
    String treeString;
    Tree tmp = this;
    while (true) {
      if (tmp.left != null) {
        tmp = tmp.left;
      } else if (tmp.left == null) {
        treeString = treeString + tmp.value + " ";
      }

    }
  }
}
