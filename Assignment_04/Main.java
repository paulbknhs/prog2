import java.util.Scanner;
import calculate.HalfAdder;

public class Main {
    public static void main(String[] args) {
        HalfAdder adder = new HalfAdder();
        Scanner scan = new Scanner(System.in);
        System.out.print("boolean a: ");
        boolean a = scan.nextBoolean();
        System.out.println();
        System.out.print("boolean b: ");
        boolean b = scan.nextBoolean();
        scan.close();
        boolean[] result = adder.add(a, b);
        System.out.printf("Summe: %d, Carry: %d.\n", (result[0] ? 1 : 0), (result[1] ? 1 : 0));
        adder.info();
    }
}
