package chapter1.section5.exercises;

public class MaxMin {
    public static void main(String[] args) {
        int max = StdIn.readInt();
        int min = max;

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            if (n > max) max = n;
            if (n < min) min = n;
        }

        StdOut.printf("maximum = %d, minimum = %d", max, min);
    }
}
