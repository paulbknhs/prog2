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
    if (value == this.value) {
      if (this.left == null && this.right == null) {
        return;
      }
      
      if (this.left == null) {
        this.value = this.right.value;
        this.left = this.right.left;
        this.right = this.right.right;
      } else if (this.right == null) {
        this.value = this.left.value;
        this.right = this.left.right;
        this.left = this.left.left;
      } else {
        Tree successor = findMin(this.right);
        this.value = successor.value;
        deleteSuccessor(this.right, successor.value);
      }
    } else if (value < this.value && this.left != null) {
      this.left.deleteValue(value);
    } else if (value > this.value && this.right != null) {
      this.right.deleteValue(value);
    }
  }

  private void deleteSuccessor(Tree node, int value) {
    if (node.left == null && node.right == null) {
      return;
    }
    
    if (node.left != null && node.left.value == value) {
      if (node.left.left == null && node.left.right == null) {
        node.left = null;
      } else if (node.left.left == null) {
        node.left = node.left.right;
      } else if (node.left.right == null) {
        node.left = node.left.left;
      } else {
        Tree successor = findMin(node.left.right);
        node.left.value = successor.value;
        deleteSuccessor(node.left.right, successor.value);
      }
    } else if (node.right != null && node.right.value == value) {
      if (node.right.left == null && node.right.right == null) {
        node.right = null;
      } else if (node.right.left == null) {
        node.right = node.right.right;
      } else if (node.right.right == null) {
        node.right = node.right.left;
      } else {
        Tree successor = findMin(node.right.right);
        node.right.value = successor.value;
        deleteSuccessor(node.right.right, successor.value);
      }
    } else if (value < node.value) {
      deleteSuccessor(node.left, value);
    } else {
      deleteSuccessor(node.right, value);
    }
  }

  private Tree findMin(Tree node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }
}
