package chapter1.section3.exercises;

public class Pepys {
    public static void main(String[] args) {
        int trials = 100000; // Number of trials for better accuracy
        int successSix = 0, successTwelve = 0;

        for (int i = 0; i < trials; i++) {
            int onesCountSix = 0;
            for (int j = 0; j < 6; j++) {
                int die = (int) (Math.random() * 6) + 1;
                if (die == 1) onesCountSix++;
            }
            if (onesCountSix >= 1) successSix++;

            int onesCountTwelve = 0;
            for (int j = 0; j < 12; j++) {
                int die = (int) (Math.random() * 6) + 1;
                if (die == 1) onesCountTwelve++;
            }
            if (onesCountTwelve >= 2) successTwelve++;
        }

        double probabilitySix = (double) successSix / Integer.MAX_VALUE;
        double probabilityTwelve = (double) successTwelve / Integer.MAX_VALUE;

        if (probabilitySix > probabilityTwelve) {
            System.out.println("It is more likely to get a 1 at least once in six rolls.");
        } else {
            System.out.println("It is more likely to get a 1 at least twice in twelve rolls.");
        }
    }
}
