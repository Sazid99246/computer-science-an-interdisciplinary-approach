package chapter1.section2.exercises;

public class AscendingOrDescending {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        System.out.println((x < y && y < z) || (x > y && y > z));
    }
}
