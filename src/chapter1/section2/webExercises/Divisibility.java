package chapter1.section2.webExercises;

public class Divisibility {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println((n1 % 7 == 0) && (n2 % 7 == 0));
    }
}
