package chapter1.section3.exercises;

public class GamblerV4 {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        double p = Double.parseDouble(args[3]);
        int maxBets = Integer.parseInt(args[4]);

        int bets = 0;
        int wins = 0;
        int totalCash = 0;

        for (int t = 0; t < trials; t++) {
            int cash = stake;
            int currentBets = 0;
            while (cash > 0 && cash < goal && currentBets < maxBets) {
                bets++;
                currentBets++;
                if (Math.random() < p) cash++;
                else cash--;
            }
            totalCash += cash;
            if (cash == goal) wins++;
        }
        double expectedCash = (double) totalCash / trials;

        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
        System.out.println("Expected cash at end: $" + expectedCash);
    }
}
