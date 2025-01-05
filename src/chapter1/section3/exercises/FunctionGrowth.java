package chapter1.section3.exercises;

public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("log n \tn \tn log n\tn^2 \tn^3 \t2^n ");
        long n = 16;
        while (n <= 2048) {
            System.out.println((int) Math.log(n) + " \t" + n + " \t" + (int) (n * Math.log(n)) + " \t" + Math.pow(n, 2) + " \t" + Math.pow(n, 3) + " \t" + Math.pow(2, n));
            n *= 2;
        }
    }
}
