package chapter1.section2.webExercises;

public class TriangleArea {
    public static void main(String[] args) {
        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double c = Integer.parseInt(args[2]);

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(area);
    }
}
