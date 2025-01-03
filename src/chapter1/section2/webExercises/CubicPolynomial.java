package chapter1.section2.webExercises;

public class CubicPolynomial {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double d = Double.parseDouble(args[2]);

        double coefficient = Math.pow(b, 2) * Math.pow(c, 2) - 4 * Math.pow(c, 3) - 4 * Math.pow(b, 3) * d - 27 * Math.pow(d, 2) + 18 * b * c * d;
        System.out.println(coefficient);
    }
}
