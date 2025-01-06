package chapter1.section3.exercises;

public class Kary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);

        String digits = "0123456789ABCDEF";
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            result.insert(0, digits.charAt(n % base));
            n /= base;
        }

        if (result.length() == 0) {
            result.append('0');
        }

        System.out.println(result);
    }
}
