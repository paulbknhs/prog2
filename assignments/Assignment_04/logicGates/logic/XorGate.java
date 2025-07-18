package logic;

/**
 * Logisches XOR-Gatter, implementiert mit Basisgattern.
 */
public class XorGate extends Gate {
  AndGate and;
  OrGate or;
  NotGate not;

  public XorGate() {
    super("^");
    this.and = new AndGate();
    this.or = new OrGate();
    this.not = new NotGate();
  }

  /**
   * Gibt true zurück, wenn genau einer der Eingänge true ist.
   */
  @Override
  public boolean evaluate(boolean a, boolean b) {
    return (and.evaluate(or.evaluate(a, b), not.evaluate(and.evaluate(a, b), b)));
  }
}
