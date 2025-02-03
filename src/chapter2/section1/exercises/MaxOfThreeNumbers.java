package chapter2.section1.exercises;

public class MaxOfThreeNumbers {
    static int max(int a, int b, int c) {
        int maxNumber = a;
        if (b > maxNumber) maxNumber = b;
        if (c > maxNumber) maxNumber = c;
        return maxNumber;
    }

    static double max(double a, double b, double c) {
        double maxNumber = a;
        if (b > maxNumber) maxNumber = b;
        if (c > maxNumber) maxNumber = c;
        return maxNumber;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int result = max(a, b, c);
        StdOut.println(result);
    }
}
