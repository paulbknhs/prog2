package logic;

/**
 * Logisches UND-Gatter.
 */
public class AndGate extends Gate {

  public AndGate() {
    super("&");
  }

  /**
   * Gibt true zurück, wenn beide Eingänge true sind.
   */
  @Override
  public boolean evaluate(boolean a, boolean b) {
    return (a == true && b == true);
  }
}
