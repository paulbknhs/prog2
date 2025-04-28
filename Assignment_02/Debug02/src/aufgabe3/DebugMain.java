package aufgabe3;

import aufgabe3.data.DebugData;

class DebugMain {
  public static void main(String[] args) {
    DebugData a = new DebugData(3.4, 5.6);
    DebugData b = new DebugData(1.0, 1.0);
    // Result should be approx. 5.18
    System.out.println(String.format("The distance between %s and %s is %g",
        a.str(), b.str(), a.distance(b)));
  }
}

// DebugMain.java:5: Fehler: Symbol nicht gefunden
// DebugData a = new DebugData(3.4, 5.6);
// ^
// Symbol: Klasse DebugData
// Ort: Klasse DebugMain
// fehlender import und nicht public
//
// idk warum das hier nicht funktioniert aber double und in war verkehrt
//
//
