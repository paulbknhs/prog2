package logic;

/**
 * Logisches NICHT-Gatter. Ignoriert zweiten Eingang.
 */
public class NotGate extends Gate {

  public NotGate() {
    super("!");
  }

  /**
   * Gibt die Negation des ersten Eingangs zurück.
   */
  @Override
  public boolean evaluate(boolean a, boolean b) {
    return !a;
  }
}
