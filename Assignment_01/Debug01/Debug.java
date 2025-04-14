class Debug { // K: 'ckass' zu 'class' korrigiert

  // Methode that checks whether a given number is prime
  public static boolean isPrime(int n) {
    // Return false if number is one, zero or negative
    if (n <= 1) { // K: 'n <= 2' zu 'n <= 1' korrigiert, da 2 eine Primzahl ist
      return false;
    }
    // Check for all factors smaller and equal to n/2 whether it is a prime factor.
    // If it is a prime factor, return false.
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false; // K: 'return true' zu 'return false' korrigiert
      }
    }
    // If no prime factor was found, return true.
    return true;
  }

  // Method that prints all numbers in an array that are prime
  public static void printPrime(int[] arr) { // K: Rückgabetyp von 'String' zu 'void' geändert
    for (int i = 0; i < arr.length; i++) { // K: 'i <= arr.length' zu 'i < arr.length' geändert
      if (isPrime(arr[i])) {
        System.out.println(arr[i]);
      }
    }
  }

  public static void main(String[] args) { // K: fehlende main-Methode ergänzt
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    printPrime(arr);
  }

  // output should be as follows:
  // 2
  // 3
  // 5
  // 7
}

/*
 * Fehlerbeschreibung:
 * 
 * Zeile 1: 'ckass' → 'class' korrigiert
 * Fehlermeldung:
 * Debug.java:1: error: class, interface, or enum expected
 * ckass Debug {
 * ^
 * 
 * Zeile 22: Methode hat Rückgabetyp 'String', gibt aber nichts zurück → 'void'
 * verwendet
 * Fehlermeldung:
 * Debug.java:22: error: missing return statement
 * 
 * Zeile 23: Zugriff auf arr[arr.length] führt zu IndexOutOfBounds →
 * Abbruchbedingung angepasst (i < arr.length)
 * 
 * Zeile 6: 'n <= 2' → falsch, da 2 eine Primzahl ist → korrigiert zu 'n <= 1'
 * 
 * Zeile 11: Logikfehler in isPrime – bei Teiler fälschlich true zurückgegeben →
 * korrigiert zu false
 * 
 * Zeilen 26-27: Code außerhalb einer Methode → muss in 'main' stehen
 * 
 */
