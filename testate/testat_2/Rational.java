package testat_2;

public class Rational {
  private int numerator, denumerator;

  public Rational(int num, int denum) {
    this.numerator = num;
    this.denumerator = denum;
  }

  public int getNumerator() {
    return this.numerator;
  }

  public int getDenumerator() {
    return this.denumerator;
  }
}
