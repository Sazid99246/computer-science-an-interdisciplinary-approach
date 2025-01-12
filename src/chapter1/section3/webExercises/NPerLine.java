package chapter1.section3.webExercises;

public class NPerLine {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;

        for (int i = 10; i < 100; i++) {
            System.out.print(i + " ");
            count++;
            if (count % n == 0) {
                System.out.println();
            }
        }
    }
}
