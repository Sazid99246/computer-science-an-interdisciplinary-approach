package chapter1.section2.exerecises;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int n1 = 1 + (int) (Math.random() * 6);
        int n2 = 1 + (int) (Math.random() * 6);

        System.out.println(n1 + n2);
    }
}
