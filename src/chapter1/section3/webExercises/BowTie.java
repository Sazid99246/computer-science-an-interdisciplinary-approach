package chapter1.section3.webExercises;

public class BowTie {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Upper half excluding the middle row
        for (int i = 0; i < n; i++) {
            // Print left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Print middle dots
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print(". ");
            }
            // Print right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Middle row
        for (int i = 0; i < (2 * n + 1); i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Lower half excluding the middle row
        for (int i = n - 1; i >= 0; i--) {
            // Print left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Print middle dots
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print(". ");
            }
            // Print right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
