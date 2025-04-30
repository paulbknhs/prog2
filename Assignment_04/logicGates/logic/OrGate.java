package logic;

/**
 * Logisches ODER-Gatter.
 */
public class OrGate extends Gate {

  public OrGate() {
    super("|");
  }

  /**
   * Gibt true zurück, wenn mindestens ein Eingang true ist.
   */
  @Override
  public boolean evaluate(boolean a, boolean b) {
    return (a == true || b == true);
  }
}
