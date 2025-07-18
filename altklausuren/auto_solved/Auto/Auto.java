package Auto;
public class Auto {
  int vmax;

  public Auto(int vmax) {
    this.vmax = vmax;
  }

  @Override
  public String toString() {
    return "Auto mit Vmax: " + this.vmax;
  }
}
