package chapter1.section3.webExercises;

public class CountDistinct {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int distinct;

        if (a == b && b == c) {
            distinct = 1;
        } else if (a == b || b == c || c == a) {
            distinct = 2;
        } else {
            distinct = 3;
        }

        System.out.println(distinct);
    }
}
