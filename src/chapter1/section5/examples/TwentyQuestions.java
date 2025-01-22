package chapter1.section5.examples;

public class TwentyQuestions {
    public static void main(String[] args) {
        int secret = 1 + (int) (Math.random() * 1000000);
        StdOut.print("I am thinking of a number ");
        StdOut.println("between 1 and 1000000");
        int guess = 0;
        while (guess != secret) {
            StdOut.println("What is your guess? ");
            guess = StdIn.readInt();
            if (guess == secret) StdOut.println("You win!");
            if (guess < secret) StdOut.println("Too low");
            if (guess > secret) StdOut.println("Too high");
        }
    }
}
