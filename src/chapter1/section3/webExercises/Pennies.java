package chapter1.section3.webExercises;

public class Pennies {
    public static void main(String[] args) {
        int pennies = Integer.parseInt(args[0]);

        int quarters = pennies / 25;
        pennies %= 25;

        int dimes = pennies / 10;
        pennies %= 10;

        int nickels = pennies / 5;
        pennies %= 5;

        // Print results
        if (quarters > 0) {
            System.out.println(quarters + " quarters");
        }
        if (dimes > 0) {
            System.out.println(dimes + " dimes");
        }
        if (nickels > 0) {
            System.out.println(nickels + " nickels");
        }
        if (pennies > 0) {
            System.out.println(pennies + " pennies");
        }
    }
}
