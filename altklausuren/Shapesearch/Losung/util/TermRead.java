package Losung.util;

import java.util.Scanner;

public class TermRead {
  private static Scanner sc_;

  public static Scanner getScanner() {
    if (TermRead.sc_ == null) {
      TermRead.sc_ = new Scanner(System.in);
    }
    return TermRead.sc_;
  }
}
