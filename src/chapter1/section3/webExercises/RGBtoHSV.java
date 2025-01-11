package chapter1.section3.webExercises;

public class RGBtoHSV {
    public static void main(String[] args) {
        int R = Integer.parseInt(args[0]);
        int G = Integer.parseInt(args[1]);
        int B = Integer.parseInt(args[2]);

        double RPrime = (double) R / 255;
        double GPrime = (double) G / 255;
        double BPrime = (double) B / 255;

        double CMax = Math.max(RPrime, Math.max(GPrime, BPrime));
        double CMin = Math.min(RPrime, Math.min(GPrime, BPrime));
        double delta = CMax - CMin;

        double H, S, V;
        if (delta != 0) {
            if (CMax == RPrime) {
                H = 60 * (((GPrime - BPrime) / delta) % 6);
            } else if (CMax == GPrime) {
                H = 60 * (((BPrime - RPrime) / delta) + 2);
            } else {
                H = 60 * (((RPrime - GPrime) / delta) + 4);
            }
        } else {
            H = 0;
        }

        // Normalize H to be between 0 and 360
        if (H < 0) {
            H += 360;
        }

        S = (CMax == 0) ? 0 : (delta / CMax);
        V = CMax;

        String RGBColor = "RGB(" + R + ", " + G + ", " + B + ")";
        String HSVColor = "HSV(" + (int) H + "deg, " + (int) S * 100 + "%, " + (int) V * 100 + "%)";

        System.out.println(RGBColor + " is as same as " + HSVColor);
    }
}
