package chapter1.section5.exercises;

public class Stats {
    public static void main(String[] args) {
        // Read input size
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readDouble();
        }

        // Calculate the mean
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double mean = sum / n;

        // Calculate the sample standard deviation
        double sum2 = 0.0;
        for (int i = 0; i < n; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }
        double stddev = Math.sqrt(sum2 / (n - 1));

        // Print the mean and standard deviation
        StdOut.println("Mean                      = " + mean);
        StdOut.println("Sample standard deviation = " + stddev);

        // Filter and print values more than 1.5 standard deviations from the mean
        StdOut.println("Values more than 1.5 standard deviations from the mean:");
        for (int i = 0; i < n; i++) {
            if (Math.abs(a[i] - mean) > 1.5 * stddev) {
                StdOut.println(a[i]);
            }
        }
    }
}
