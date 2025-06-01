package testat_2;

import java.util.ArrayList;
import testat_2.Rational;

public class Array {

    ArrayList<Rational> rationals;

    public Array(int n) {
        rationals = new ArrayList<>();
        if (n == 0)
            throw new ArithmeticException("Division by zero");
        for (int i = 0; i <= n; i++) {
            rationals.add(new Rational(i, n));
        }
    }

    public void print() {
        for (Rational rational : rationals) {
            System.out.printf("(%d/%d) ", rational.getNumerator(), rational.getDenumerator());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array test1 = new Array(5);
        Array test2 = new Array(1);
        Array test3 = new Array(10);
        test1.print();
        test2.print();
        test3.print();
    }
}