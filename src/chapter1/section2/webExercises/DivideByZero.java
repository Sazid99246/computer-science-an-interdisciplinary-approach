package chapter1.section2.webExercises;

public class DivideByZero {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        double b = (double) a;

        System.out.println(a / 0);
        System.out.println(b / 0.0);
    }
}
