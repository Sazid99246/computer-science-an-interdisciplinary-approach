package chapter1.section3.exercises;

public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            if (b == 0) {
                System.out.println("This is not a quadratic equation.");
            } else {
                double root = -c / b;
                System.out.println("Single root: " + root);
            }
        } else {
            double discriminant = b * b - 4.0 * a * c;

            if (discriminant > 0) {
                double sqrtD = Math.sqrt(discriminant);
                double root1 = (-b + sqrtD) / (2.0 * a);
                double root2 = (-b - sqrtD) / (2.0 * a);
                System.out.println("Two real roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2.0 * a);
                System.out.println("One real root: " + root);
            } else {
                double realPart = -b / (2.0 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2.0 * a);
                System.out.println("Two complex roots: " + realPart + " + " + imaginaryPart + "i and " + realPart + " - " + imaginaryPart + "i");
            }
        }
    }
}
