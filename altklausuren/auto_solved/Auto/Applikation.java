import java.awt.Color;
import Auto.Auto;

public class Applikation {
  public static void main(String[] args) {
    Auto postauto = new Auto(0);
    System.out.println(postauto.toString());
    Auto newAuto = new Auto(0) {
      int vmax = 80;
      Color color = Color.yellow;
      @Override
      public String toString() {
        return "Auto mit Vmax: " + this.vmax + " und Farbe java.awt.Color[ " + this.color.getRed() + this.color.getGreen() + this.color.getBlue() + " ]";
      }
    };
    postauto = newAuto;
    System.out.println(postauto.toString());
  }
}
