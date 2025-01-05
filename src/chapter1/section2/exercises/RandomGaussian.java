package chapter1.section2.exercises;
public class RandomGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        System.out.println(Math.sin(2 * Math.PI * v) * (-2 * Math.log(u)));
    }
}
