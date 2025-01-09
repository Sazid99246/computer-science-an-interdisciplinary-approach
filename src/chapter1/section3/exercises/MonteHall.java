package chapter1.section3.exercises;

public class MonteHall {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int stayWins = 0;
        int switchWins = 0;

        for (int i = 0; i < N; i++) {
            // Randomly place the prize behind one of the three doors
            int prizeDoor = (int) (Math.random() * 3);
            // Randomly choose a door
            int chosenDoor = (int) (Math.random() * 3);

            // Simulate the host opening a door
            int revealedDoor;
            do {
                revealedDoor = (int) (Math.random() * 3);
            } while (revealedDoor == prizeDoor || revealedDoor == chosenDoor);

            // Determine the other door that the contestant can switch to
            int switchDoor = 3 - chosenDoor - revealedDoor;

            // Check outcomes
            if (chosenDoor == prizeDoor) {
                stayWins++;
            }
            if (switchDoor == prizeDoor) {
                switchWins++;
            }
        }

        double staySuccessRate = (double) stayWins / N * 100;
        double switchSuccessRate = (double) switchWins / N * 100;

        System.out.printf("Out of %d simulations:\n", N);
        System.out.printf("Success rate when staying: %.2f%%\n", staySuccessRate);
        System.out.printf("Success rate when switching: %.2f%%\n", switchSuccessRate);
    }
}
