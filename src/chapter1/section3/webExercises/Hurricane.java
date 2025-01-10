package chapter1.section3.webExercises;

public class Hurricane {
    public static void main(String[] args) {
        int milePerHour = Integer.parseInt(args[0]);
        if (milePerHour < 74) {
            System.out.println("Not a hurricane");
        } else {
            if (milePerHour <= 95) {
                System.out.println("Class 1 hurricane");
            } else if (milePerHour <= 110) {
                System.out.println("Class 2 hurricane");
            } else if (milePerHour <= 130) {
                System.out.println("Class 3 hurricane");
            } else if (milePerHour <= 155) {
                System.out.println("Class 4 hurricane");
            } else {
                System.out.println("Class 5 hurricane");
            }
        }
    }
}
