package chapter1.section2.exercises;

public class Stats5 {
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();

        double avg = (n1 + n2 + n3 + n4 + n5) / 5.0;
        double min = Math.min(n1, Math.min(n2, Math.min(n3, Math.min(n4, n5))));
        double max = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(avg);
        System.out.println(min);
        System.out.println(max);
    }
}
