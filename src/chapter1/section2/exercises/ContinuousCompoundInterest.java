package chapter1.section2.exercises;

public class ContinuousCompoundInterest {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[2]);

        double totalAmount = p * Math.exp(((double) r / 100) * t);
        System.out.println(totalAmount);
    }
}
