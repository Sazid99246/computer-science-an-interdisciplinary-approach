package chapter1.section3.webExercises;

public class Season {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int D = Integer.parseInt(args[1]);
        String season = "";

        if ((M == 3 && D >= 21) || (M > 3 && M < 6) || (M == 6 && D <= 20)) {
            season = "Spring";
        } else if ((M == 6 && D >= 21) || (M > 6 && M < 9) || (M == 9 && D <= 22)) {
            season = "Summer";
        } else if ((M == 9 && D >= 23) || (M > 9 && M < 12) || (M == 12 && D <= 20)) {
            season = "Fall";
        } else {
            season = "Winter";
        }

        System.out.println(season);
    }
}
