package chapter1.section3.exercises;

public class WindChillUpdated {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if (t > Math.abs(50)) {
            System.out.println("Temperature must be less than the absolute value of 50");
        } else if (v > 120 || v < 3) {
            System.out.println("Velocity must be in between 3 and 120");
        } else {
            double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println(w);
        }
    }
}
