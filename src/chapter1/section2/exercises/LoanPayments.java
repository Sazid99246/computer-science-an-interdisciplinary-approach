package chapter1.section2.exercises;

public class LoanPayments {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        int r = Integer.parseInt(args[2]);

        double totalAmount = p * Math.exp(r * t);
        System.out.println(totalAmount / (t * 12));

        System.out.println();
    }
}
