package chapter1.section2.exercises;

public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        System.out.println((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 31) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20));
    }
}
