public enum Action {
  A,
  B;

  public String toString() {
    switch (this) {
      case A:
        return "A";
      case B:
        return "B";
      default:
        return "";
    }
  }
}
