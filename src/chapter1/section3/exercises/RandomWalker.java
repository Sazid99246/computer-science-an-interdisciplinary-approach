package chapter1.section3.exercises;

public class RandomWalker {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int x = 0; int y = 0;
        int steps = 0;

        while (Math.abs(x) < N && Math.abs(y) < N) {
            double r = Math.random();
            if (r < 0.25) {
                x++;
            } else if (r < 0.50) {
                x--;
            } else if (r < 0.75) {
                y++;
            } else {
                y--;
            }
            steps++;
        }

        System.out.println(steps);
    }
}
