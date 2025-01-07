package chapter1.section3.exercises;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int originalX = x;
        int originalY = y;

        while (y > 0) {
            int remainder = x % y;
            x = y;
            y = remainder;
        }

        System.out.println("The Greatest Common Divisor(GCD) of " + originalX + " and " + originalY + " is " + x);
    }
}
