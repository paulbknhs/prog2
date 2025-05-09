import java.lang.StringBuilder;

public class Decryption {

  static String Decrypt(String encrypted, int offset) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < encrypted.length(); i++) {
      if ((int) encrypted.charAt(i) - offset < 97) {
        sb.append((char) (encrypted.charAt(i) - offset + 26));
      } else {
        sb.append((char) (encrypted.charAt(i) - offset));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String encrypted = "abcdef";
    String decrypted = Decrypt(encrypted, 2);
    System.out.printf("encrypted: %s\n", encrypted);
    System.out.printf("dectypted with key %d: %s\n", 2, decrypted);
  }
}
