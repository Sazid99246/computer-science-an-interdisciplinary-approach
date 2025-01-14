package chapter1.section3.webExercises;

public class Zodaic {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);

        if ((M == 12 && D >= 22) || (M == 1 && D <= 19)) {
            System.out.println("Capricorn");
        } else if (M == 1 || M == 2 && D <= 17) {
            System.out.println("Aquarius");
        } else if (M == 2 || M == 3 && D <= 19) {
            System.out.println("Pisces");
        } else if (M == 3 || M == 4 && D <= 19) {
            System.out.println("Aries");
        } else if (M == 4 || M == 5 && D <= 20) {
            System.out.println("Taurus");
        } else if (M == 5 || M == 6 && D <= 20) {
            System.out.println("Gemini");
        } else if (M == 6 || M == 7 && D <= 22) {
            System.out.println("Cancer");
        } else if (M == 7 || M == 8 && D <= 22) {
            System.out.println("Leo");
        } else if (M == 8 || M == 9 && D <= 22) {
            System.out.println("Virgo");
        } else if (M == 9 || M == 10 && D <= 22) {
            System.out.println("Libra");
        } else if (M == 10 || M == 11 && D <= 21) {
            System.out.println("Scorpio");
        } else {
            System.out.println("Sagittarius");
        }
    }
}
