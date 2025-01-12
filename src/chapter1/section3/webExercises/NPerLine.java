package chapter1.section3.webExercises;

public class NPerLine {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print("   ");
            } else if (i < 100) {
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
            count++;
            if (count % n == 0) {
                System.out.println();
            }
        }
    }
}
