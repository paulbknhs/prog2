import java.util.ArrayList;

public class Password {
  public static void main(String[] args) {
    String satz = "Das ist der erste Satz den ich schreibe\n";
    System.out.printf("Satz: %s", satz);

    int countCapitalLetters = 0;
    ArrayList<Character> chars = new ArrayList<>();
    for (int i = 0; i < satz.length(); i++) {
      if (i == 0 || satz.charAt(i - 1) == ' ') {
        chars.add(satz.charAt(i));
        if ((int) satz.charAt(i) >= 65 && (int) satz.charAt(i) <= 90) {
          countCapitalLetters++;
        }
      }
    }
    StringBuilder str = new StringBuilder(satz.length());
    for (Character character : chars) {
      str.append(character);
    }
    str.append(countCapitalLetters);
    System.out.printf("Passwort: %s\n", str.toString());
  }
}
