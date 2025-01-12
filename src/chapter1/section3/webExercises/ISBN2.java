package chapter1.section3.webExercises;

public class ISBN2 {
    public static void main(String[] args) {
        // Read input as a string for easy manipulation
        String isbnInput = args[0];

        // Calculate the sum for the check digit
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(isbnInput.charAt(i));
            sum += digit * (10 - i);
        }

        // Calculate the check digit
        int checkDigit = 11 - (sum % 11);
        if (checkDigit == 10) {
            isbnInput += "X";
        } else if (checkDigit == 11) {
            isbnInput += "0";
        } else {
            isbnInput += checkDigit;
        }

        // Format the ISBN number (assuming format 0-XXX-XXXXX-X)
        String formattedISBN = String.format("%s-%s-%s-%s",
                isbnInput.charAt(0),
                isbnInput.substring(1, 4),
                isbnInput.substring(4, 9),
                isbnInput.substring(9));

        // Print the formatted ISBN
        System.out.println(formattedISBN);
    }
}
