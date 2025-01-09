package chapter1.section3.exercises;

public class Cos {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        x = x % (2 * Math.PI);

        double term = 1.0;
        double sum = 0.0;

        for (int i = 0; term != 0.0; i++) {
            if (i % 2 == 0) {  // Only even powers are used in cos series
                if ((i / 2) % 2 == 0) {
                    sum += term;
                } else {
                    sum -= term;
                }
            }
            term *= (x / (i + 1));
        }
        System.out.println(sum);
    }
}
