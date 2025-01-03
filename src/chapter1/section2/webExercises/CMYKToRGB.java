package chapter1.section2.webExercises;

public class CMYKToRGB {
    public static void main(String[] args) {
        int C = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        int Y = Integer.parseInt(args[2]);
        int K = Integer.parseInt(args[3]);

        int R = 255 * (1 - C / 100) * (1 - K / 100);
        int G = 255 * (1 - M / 100) * (1 - K / 100);
        int B = 255 * (1 - Y / 100) * (1 - K / 100);

        System.out.println("The color value of CMYK(" + C + "," + M + "," + Y + "," + K + ") = RGB(" + R + "," + G + "," + B + ")");
    }
}
