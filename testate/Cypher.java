/*  Es soll ein Caesar-Cypher implementiert werden, welcher die
 *  Buchstaben um einen Integer Wert verschiebt.
 *  Falls der Wert ausßerhalb des Buchstabenbereichs landet, muss
 *  um das Alphabet herum geloopt werden.
 *
 *  Beispiel:
 *  Zu entschlüsseln: Cbbc
 *  Schlüssel: 2
 *
 *  Ausgabe: Abba
 *
 * */

import java.lang.StringBuilder;
import java.util.Scanner;

public class Cypher {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Zu entschlüsseln: ");
    String encrypted = scan.next();
    System.out.print("Schlüssel: ");
    Integer key = scan.nextInt();
    scan.close();

    StringBuilder decrypted = new StringBuilder();

    for (int i = 0; i < encrypted.length(); i++) {
      char c = encrypted.charAt(i);
      if (Character.isUpperCase(c) && c - key < 65 || Character.isLowerCase(c) && c - key < 97) {
        decrypted.append((char) (c - key + 26));
      } else {
        decrypted.append((char) (c - key));
      }
    }
    System.out.println(decrypted.toString());
  }
}
