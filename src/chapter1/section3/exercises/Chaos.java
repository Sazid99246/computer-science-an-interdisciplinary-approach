package chapter1.section3.exercises;

public class Chaos {
    public static void main(String[] args) {
        double x = 0.01;  // Initial population
        int iterations = 100;  // Number of iterations

        if (args.length != 1) {
            System.out.println("Usage: java Chaos <fecundity_parameter>");
            return;
        }

        double r = Double.parseDouble(args[0]);  // Fecundity parameter

        System.out.printf("Iterating the logistic map with r = %.2f\n", r);
        System.out.printf("Initial population: %.4f\n", x);
        for (int i = 0; i < iterations; i++) {
            x = r * x * (1 - x);
            System.out.printf("Iteration %3d: x = %.4f\n", i + 1, x);
        }
    }
}
