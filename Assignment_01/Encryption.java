public class Encryption {

  public static void main(String[] args) {
    char[] test1 = { 'H', 'E', 'L', 'L', 'O' };
    char[] test2 = { 'W', 'O', 'R', 'L', 'D' };

    int[] keys = new int[test1.length];
    for (int i = 0; i < test1.length; i++) {
      keys[i] = nextInt(7, 28, 256, 3);
    }

    System.out.print("Original: ");
    printCharArray(test1);
    System.out.print("Encryption: ");
    printIntArray(encrypt(test1, keys));
    System.out.print("Decryption: ");
    printCharArray(decrypt(encrypt(test1, keys), keys));

    System.out.print("Original: ");
    printCharArray(test2);
    System.out.print("Encryption: ");
    printIntArray(encrypt(test2, keys));
    System.out.print("Decryption: ");
    printCharArray(decrypt(encrypt(test2, keys), keys));

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

  public static void printIntArray(int[] integers) {
    for (int i = 0; i < integers.length; i++) {
      System.out.print(integers[i] + " ");
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
        decrypted[i] = (char) (letters[i] ^ keys[i] ^ letters[i - 1]);
      }
    }
    return decrypted;
  }
}
