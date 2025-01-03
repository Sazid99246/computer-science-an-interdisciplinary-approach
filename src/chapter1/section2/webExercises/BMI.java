package chapter1.section2.webExercises;

public class BMI {
    public static void main(String[] args) {
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
    }
}
