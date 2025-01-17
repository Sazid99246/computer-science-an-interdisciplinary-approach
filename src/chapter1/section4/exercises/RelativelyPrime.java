package chapter1.section4.exercises;

public class RelativelyPrime {

    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to check if two numbers are relatively prime
    public static boolean areRelativelyPrime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer N as a command line argument.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        // Create N-by-N boolean array
        boolean[][] a = new boolean[N][N];

        // Fill the array using the relatively prime condition
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = areRelativelyPrime(i, j);
            }
        }

        // Print the array
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
