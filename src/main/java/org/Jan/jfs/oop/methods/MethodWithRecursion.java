package org.Jan.jfs.oop.methods;

public class MethodWithRecursion {

    public int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumOfNaturalNumbers(n - 1);
    }

    public int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(a, a % b);
    }

    public void showTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
