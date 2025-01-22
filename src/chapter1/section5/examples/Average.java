package chapter1.section5.examples;

public class Average {
    public static void main(String[] args) {
        int count = 0;
        double sum = 0.0;

        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        double average = sum / count;
        StdOut.println("chapter1.section5.examples.Average is " + average);
    }
}
