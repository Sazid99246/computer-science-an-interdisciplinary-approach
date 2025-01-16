package chapter1.section4.exercises;

public class HowMany {
    public static void main(String[] args) {
        int argLength = args.length;
        System.out.print("You entered a total of " + argLength +" command line argument");
        if (argLength == 1) {
            System.out.println(".");
        } else {
            System.out.println("s.");
        }
    }
}
