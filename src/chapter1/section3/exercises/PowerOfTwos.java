package chapter1.section3.exercises;

public class PowerOfTwos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 2; i <= n; i *= 2) {
            System.out.println(i);
        }
    }
}
