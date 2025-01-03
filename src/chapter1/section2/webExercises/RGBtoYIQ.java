package chapter1.section2.webExercises;

public class RGBtoYIQ {
    public static void main(String[] args) {
        int R = Integer.parseInt(args[0]);
        int G = Integer.parseInt(args[1]);
        int B = Integer.parseInt(args[2]);

        double Y = 0.299 * R + 0.587 * G + 0.114 * B;
        double I = 0.596 * R - 0.275 * G - 0.321 * B;
        double Q = 0.212 * R + 0.523 * G + 0.311 * B;

        System.out.println("The color value of RGB(" + R + "," + G + "," + B + ") = YIQ(" + Y + "," + I + "," + Q + ")");
    }
}
