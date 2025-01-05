package chapter1.section3.exercises;

public class ContinuousCompoundInterestExtended {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        System.out.println("Year\tAmount");
        for (int i = 0; i <= 25; i++) {
            double totalAmount = p * Math.exp(((double) r / 100) * i);
            System.out.println(i + "\t" + totalAmount);
        }
    }
}
