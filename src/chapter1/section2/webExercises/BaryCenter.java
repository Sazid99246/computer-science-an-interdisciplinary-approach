package chapter1.section2.webExercises;

public class BaryCenter {
    public static void main(String[] args) {
        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);
        int a = Integer.parseInt(args[2]);

        double r1 = a * m2 / (m1 + m2);

        System.out.println(r1);
    }
}
