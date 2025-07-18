package logic;

/**
 * Basisklasse für logische Gatter.
 */
public class Gate {
  public String symbol;

  /**
   * Erstellt ein neues Gate mit gegebenem Symbol.
   * @param sym Symbol des Gatters
   */
  public Gate(String sym) {
    this.symbol = sym;
  }

  /**
   * Wandelt eine Ganzzahl in einen booleschen Wert um.
   * @param integer 0 oder 1
   * @return true bei 1, sonst false
   */
  private boolean intToBoolean(int integer) {
    return (integer == 0) ? false : true;
  }

  /**
   * Führt die logische Operation mit zwei Eingängen aus.
   * Muss von Unterklassen überschrieben werden.
   * @param a erster Eingang
   * @param b zweiter Eingang
   * @return Ergebnis der logischen Operation
   */
  public boolean evaluate(boolean a, boolean b) {
    return false;
  }

  /**
   * Gibt die Wahrheitstabelle des Gatters auf der Konsole aus.
   */
  public void table() {
    System.out.printf("| a | b | a %s b |\n", this.symbol);
    for (int a = 0; a <= 1; a++) {
      for (int b = 0; b <= 1; b++) {
        System.out.printf("| %d | %d |   %d   | \n", a, b, evaluate(intToBoolean(a), intToBoolean(b)) ? 1 : 0);
      }
    }
    System.out.println();
  }
}
