package chapter1.section2.exerecises;

public class MercatorProjection {
    public static void main(String[] args) {
        double latitude = Math.toRadians(Double.parseDouble(args[0]));
        double longitude = Double.parseDouble(args[1]);
        double centeredLongitude = Double.parseDouble(args[2]);

        double x = longitude - centeredLongitude;
        double y = 0.5 * Math.log((1 + Math.sin(latitude)) / (1 - Math.sin(latitude)));
        System.out.println(x);
        System.out.println(y);
    }
}
