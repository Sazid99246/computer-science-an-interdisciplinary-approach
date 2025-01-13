package chapter1.section3.webExercises;

public class UPC {
    public static void main(String[] args) {
        // Check if there is an argument provided
        if (args.length != 1) {
            System.out.println("Please provide a single 11-digit UPC code.");
            return;
        }

        String upcCode = args[0];

        // Check if the length is exactly 11
        if (upcCode.length() != 11) {
            System.out.println("The input must be exactly 11 digits long.");
            return;
        }

        int evensum = 0, oddsum = 0;

        // Calculate sums for odd and even positions
        for (int i = 0; i < upcCode.length(); i++) {
            int digit = Character.getNumericValue(upcCode.charAt(i));
            if (i % 2 == 0) {
                oddsum += digit;
            } else {
                evensum += digit;
            }
        }

        // Calculate the check digit
        int totalSum = oddsum + 3 * evensum;
        int checkDigit = (10 - (totalSum % 10)) % 10;

        // Print the full UPC code
        System.out.println("The full UPC code is: " + upcCode + checkDigit);
    }
}
