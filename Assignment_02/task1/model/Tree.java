package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    this.right = right;
  }

  public String str() {
    List<Integer> treeList = new ArrayList<>();
    traverse(this, treeList);
    return treeList.stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" "));
  }

  private void traverse(Tree node, List<Integer> output) {
    if (node == null)
      return;
    traverse(node.getLeft(), output);
    output.add(node.getValue());
    traverse(node.getRight(), output);
  }

  public boolean contains(int value) {
    List<Integer> treeList = new ArrayList<>();
    traverse(this, treeList);
    return treeList.contains(value);
  }

  public void insertValue(int value) {
    if (value < this.value) {
      if (this.left == null) {
        this.left = new Tree(value);
      } else {
        this.left.insertValue(value);
      }
    } else if (value > this.value) {
      if (this.right == null) {
        this.right = new Tree(value);
      } else {
        this.right.insertValue(value);
      }
    }
  }

  public void deleteValue(int value) {
    List<Integer> treeList = new ArrayList<>();
    traverse(this, treeList);
    treeList.remove(Integer.valueOf(value));
    Tree tmp = new Tree(this.value);
    for (Integer val : treeList) {
      tmp.insertValue(val);
    }
  }
}
