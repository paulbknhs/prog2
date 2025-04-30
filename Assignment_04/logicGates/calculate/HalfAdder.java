package calculate;

import logic.*;

/**
 * Halbaddierer mit XOR- und AND-Gatter.
 */
public class HalfAdder {
  Gate[] gates;

  /**
   * Konstruktor initialisiert XOR- und AND-Gatter.
   */
  public HalfAdder() {
    this.gates = new Gate[]{new XorGate(), new AndGate()};
  }

  /**
   * Addiert zwei boolesche Werte.
   * @param a erster Eingang
   * @param b zweiter Eingang
   * @return Array mit Summe [0] und Übertrag [1]
   */
  public boolean[] add(boolean a, boolean b) {
    boolean c = gates[1].evaluate(a, b);
    boolean s = gates[0].evaluate(a, b);
    return new boolean[]{s, c};
  }

  /**
   * Gibt die Wahrheitstabellen der verwendeten Gatter aus.
   */
  public void info() {
    for (Gate gate : this.gates) {
      gate.table();
    }
  }
}
