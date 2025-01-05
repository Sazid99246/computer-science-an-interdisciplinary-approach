package chapter1.section2.exercises;

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int medium = a + b + c - max - min;

        System.out.print(min + " ");
        System.out.print(medium + " ");
        System.out.println(max);
    }
}
