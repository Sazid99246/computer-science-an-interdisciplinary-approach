package chapter1.section3.webExercises;

public class Binary2 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StringBuilder stringBuilder = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 0) {
                stringBuilder.append("0");
            } else {
                stringBuilder.append("1");
            }
            n /= 2;
        }
        stringBuilder.reverse();
        String s = stringBuilder.toString();
        System.out.println(s);
    }
}
