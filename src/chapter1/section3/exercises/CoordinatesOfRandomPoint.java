package chapter1.section3.exercises;

public class CoordinatesOfRandomPoint {
    public static void main(String[] args) {
        double a, b, x, y, z;

        do {
            a = 2 * Math.random() - 1.0;
            b = 2 * Math.random() - 1.0;
        } while (a * a + b * b >= 1.0);

        x = 2 * a * Math.sqrt(1 - a * a - b * b);
        y = 2 * b * Math.sqrt(1 - a * a - b * b);
        z = 1 - 2 * (a * a + b * b);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}

