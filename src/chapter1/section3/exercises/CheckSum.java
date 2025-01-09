package chapter1.section3.exercises;

public class CheckSum {
    public static void main(String[] args) {
        long isbn = Long.parseLong(args[0]);
        long sum = 0;
        long n = 2;
        while (isbn > 0) {
            long left = isbn % 10;
            sum += n * left;
            isbn /= 10;
            n++;
        }

        int check = 0;
        while (sum % 11 != 0) {
            check++;
            sum++;
        }

        System.out.println(check);
    }
}
