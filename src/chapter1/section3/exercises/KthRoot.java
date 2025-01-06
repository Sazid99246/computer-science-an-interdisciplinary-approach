package chapter1.section3.exercises;

public class KthRoot {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        double epsilon = 1.0e-15;
        double t = N;
        while (Math.abs(Math.pow(t, k) - N) > epsilon * Math.pow(t, k)) {
            t = t - (Math.pow(t, k) - N) / (k * Math.pow(t, k - 1));
        }
        System.out.println("The " + k + "-th root of " + N + " is: " + t);
    }
}
