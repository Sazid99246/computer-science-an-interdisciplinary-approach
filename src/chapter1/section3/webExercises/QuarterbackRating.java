package chapter1.section3.webExercises;

public class QuarterbackRating {
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        double D = Double.parseDouble(args[3]);
        double E = Double.parseDouble(args[4]);

        // Calculate the components
        double W = 250.0 / 3 * ((A / B) - 0.3);
        double X = 25.0 / 6 * ((C / B) - 3);
        double Y = 1000.0 / 3 * (D / B);
        double Z = 1250.0 / 3 * (0.095 - (E / B));

        // Ensure each component is between 0 and 475/12
        W = Math.max(0, Math.min(W, 475.0 / 12));
        X = Math.max(0, Math.min(X, 475.0 / 12));
        Y = Math.max(0, Math.min(Y, 475.0 / 12));
        Z = Math.max(0, Math.min(Z, 475.0 / 12));

        // Calculate the quarterback rating
        double rating = (W + X + Y + Z) / 6.0;

        // Print the result
        System.out.println("Quarterback Rating: " + rating);
    }
}
