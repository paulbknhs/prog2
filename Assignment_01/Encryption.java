public class Encryption {

  int x0 = 3;
  int a = 7;
  int b = 28;
  int m = 256;

  public static void main(String[] args) {

  }

  public static int nextInt(int a, int b, int m, int x) {
    return (a * x + b) % m;
  }

  public static void printCharArray(char[] letters) {
    for (int i = 0; i < letters.length; i++) {
      System.out.print(letters[i]);
    }
    System.out.println();
  }

  public static int[] encrypt(char[] letters, int[] keys) {
    int[] encrypted = new int[letters.length];
    for (int i = 0; i < letters.length; i++) {
      if (i == 0) {
        encrypted[i] = (int) letters[i] ^ (int) keys[i];
      } else {
        encrypted[i] = (int) letters[i] ^ (int) keys[i] ^ (int) encrypted[i - 1];
      }
    }
    return encrypted;
  }

  public static char[] decrypt(int[] letters, int[] keys) {
    char[] decrypted = new char[letters.length];
    for (int i = 0; i < letters.length; i++) {
      if (i == 0) {
        decrypted[i] = (char) (letters[i] ^ keys[i]);
      } else {
        decrypted[i] = (char) (letters[i] ^ keys[i] ^ decrypted[i - 1]);
      }
    }
    return decrypted;
  }
}
