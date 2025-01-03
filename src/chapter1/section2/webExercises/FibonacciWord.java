package chapter1.section2.webExercises;

public class FibonacciWord {
    public static void main(String[] args) {
        String s0 = args[0];
        String s1 = args[1];
        String s2 = s1 + s0;
        String s3 = s2 + s1;
        String s4 = s3 + s2;
        String s5 = s4 + s3;
        String s6 = s5 + s4;
        String s7 = s6 + s5;
        String s8 = s7 + s6;
        String s9 = s8 + s7;
        String s10 = s9 + s8;

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);
    }
}
