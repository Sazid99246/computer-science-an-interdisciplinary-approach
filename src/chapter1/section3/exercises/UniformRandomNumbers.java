package chapter1.section3.exercises;

public class UniformRandomNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double m = Math.random();
            System.out.println(m);
            sum += m;
        }

        double avg = sum / n;
        System.out.println(avg);
    }
}
