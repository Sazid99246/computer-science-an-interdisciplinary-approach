package chapter1.section2.exerecises;

public class UniformRandomNumbers {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        // print the numbers
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // print average value;
        System.out.println((a + b + c + d + e) / 5.0);
        // print max value
        System.out.println(Math.min(a, Math.min(b, Math.min(c, Math.min(d, e)))));
        // print min value
        System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));
    }
}
