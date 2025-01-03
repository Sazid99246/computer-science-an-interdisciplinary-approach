package chapter1.section2.exerecises;

public class RGBToCMYK {
    public static void main(String[] args) {
        int R = Integer.parseInt(args[0]);
        int G = Integer.parseInt(args[1]);
        int B = Integer.parseInt(args[2]);

        int w = Math.max(R / 255, Math.max(G / 255, B / 255));
        int C = w - ((R / 255) / w);
        int M = w - ((G / 255) / w);
        int Y = w - ((G / 255) / w);
        int K = 1 - w;

        System.out.println("The color value of RGB(" + R + "," + G + "," + B + ") is CMYK(" + C + "," + M + "," + Y + "," + K + ")");
    }
}
