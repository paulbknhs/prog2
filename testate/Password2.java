import java.util.ArrayList;
import java.lang.StringBuilder;

public class Password2 {

  public static void main(String[] args) {
    String sentence = args[0];
    ArrayList<Character> charList = new ArrayList<>();
    int uppercaseCounter = 0;

    for (int i = 0; i < sentence.length(); i++) {
      char c = sentence.charAt(i);
      if (i == 0 || sentence.charAt(i - 1) == ' ' && Character.isAlphabetic(c)) {
        charList.add(c);
      }
      if (Character.isUpperCase(c)) {
        uppercaseCounter++;
      }
    }

    StringBuilder password = new StringBuilder();
    for (char c : charList) {
      password.append(c);
    }
    password.append(uppercaseCounter);
    System.out.println(password);
  }
}
