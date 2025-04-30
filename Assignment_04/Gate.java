public class Gate {
  public String symbol;

  public Gate(String sym) {
    this.symbol = sym;
  }

  private boolean intToBoolean(int integer) {
    return (integer == 0) ? false : true;
  }

  public boolean evaluate(boolean a, boolean b) {
    return false;
  }

  public void table() {
    System.out.printf("a | b | a %s b", this.symbol);
    for (int a = 0; a <= 1; a++) {
      for (int b = 0; b <= 1; b++) {
        System.out.printf("%d | %d | %d\n", a, b, evaluate(intToBoolean(a), intToBoolean(b)) ? 0 : 1);
      }
    }
  }
}
