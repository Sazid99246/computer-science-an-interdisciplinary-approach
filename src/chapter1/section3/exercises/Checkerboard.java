package chapter1.section3.exercises;

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else {
                    if (j % 2 == 1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
