package chapter1.section3.exercises;

public class PowersOfK {
    public static void main(String[] args) {
        long k = Long.parseLong(args[0]);
        long result = 1;
        int power = 0;

        while (result > 0 && result <= Long.MAX_VALUE / k) {
            System.out.println(k + "^" + power + " = " + result);
            result *= k;
            power++;
        }
        if (result > 0) {
            System.out.println(k + "^" + power + " = " + result);
        }
    }
}
