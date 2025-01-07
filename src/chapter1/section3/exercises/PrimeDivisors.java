package chapter1.section3.exercises;

public class PrimeDivisors {

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.print("The prime divisors of " + n + " is: ");
        boolean first = true;

        for (long factor = 2; factor * factor <= n; factor++) {
            boolean factorPrinted = false;

            while (n % factor == 0) {
                if (!factorPrinted) {
                    if (!first) {
                        System.out.print(" ");
                    }
                    System.out.print(factor);
                    factorPrinted = true;
                    first = false;
                }
                n = n / factor;
            }
        }

        if (n > 1) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.println(n);
        } else {
            System.out.println();
        }
    }
}
