package chapter1.section2.webExercises;

public class Swap {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 0;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        c = a;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        a = b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        b = c;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
