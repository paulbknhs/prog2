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

  private void copyFrom(Tree node) {
    if (node == null) {
      throw new NullPointerException("Can't copy from a null node.");
    }
    this.value = node.value;
    this.left = node.left;
    this.right = node.right;
  }

  public void deleteValue(int value) {
    if (value == this.value) {
      if (this.left == null && this.right == null) {
        throw new UnsupportedOperationException();
      } else if (this.left == null) {
        copyFrom(this.right);
      } else if (this.right == null) {
        copyFrom(this.left);
      } else {
        Tree successor = findMin(this.right);
        this.value = successor.value;
        this.right = removeMinNode(this.right);
      }
    } else if (value < this.value && this.left != null) {
      if (this.left.value == value) {
        this.left = deleteChildNode(this.left);
      } else {
        this.left.deleteValue(value);
      }
    } else if (value > this.value && this.right != null) {
      if (this.right.value == value) {
        this.right = deleteChildNode(this.right);
      } else {
        this.right.deleteValue(value);
      }
    }
  }

  private Tree deleteChildNode(Tree nodeToDelete) {
    if (nodeToDelete.left == null && nodeToDelete.right == null) {
      return null;
    }
    if (nodeToDelete.left == null) {
      return nodeToDelete.right;
    }
    if (nodeToDelete.right == null) {
      return nodeToDelete.left;
    }
    Tree successor = findMin(nodeToDelete.right);
    nodeToDelete.setValue(successor.getValue());
    nodeToDelete.setRight(removeMinNode(nodeToDelete.getRight()));
    return nodeToDelete;
  }

  private Tree findMin(Tree node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }

  private Tree removeMinNode(Tree node) {
    if (node == null) {
      return null;
    }
    if (node.left == null) {
      return node.right;
    }
    node.left = removeMinNode(node.left);
    return node;
  }
}
