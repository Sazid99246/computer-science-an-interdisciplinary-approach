package chapter1.section3.exercises;

public class FiveIntegersPerLine {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }
}
