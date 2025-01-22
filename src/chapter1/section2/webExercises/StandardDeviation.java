package chapter1.section2.webExercises;

public class StandardDeviation {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();

        double avg = (n1 + n2 + n3 + n4 + n5) / 5.0;
        double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
        double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));

        double sumOfSquares = Math.pow((n1 - avg), 2) +
                              Math.pow((n2 - avg), 2) +
                              Math.pow((n3 - avg), 2) +
                              Math.pow((n4 - avg), 2) +
                              Math.pow((n5 - avg), 2);

        double stdDeviation = Math.sqrt(sumOfSquares / 4);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("n5 = " + n5);
        System.out.println("chapter1.section5.examples.Average of all numbers = " + avg);
        System.out.println("Minimum of all numbers = " + min);
        System.out.println("Maximum of all numbers = " + max);
        System.out.println("Standard Deviation = " + stdDeviation);
    }
}
