package chapter1.section2.exercises;

public class GymnasticsScorer {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        double n3 = Double.parseDouble(args[2]);
        double n4 = Double.parseDouble(args[3]);
        double n5 = Double.parseDouble(args[4]);
        double n6 = Double.parseDouble(args[5]);

        double total = n1 + n2 + n3 + n4 + n5 + n6;
        double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, Math.max(n5, n6)))));
        double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, Math.min(n5, n6)))));

        total = total - max - min;
        double avg = total / 4;

        System.out.println("The final score is: " + avg);
    }
}
