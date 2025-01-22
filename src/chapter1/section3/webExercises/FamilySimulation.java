package chapter1.section3.webExercises;

import java.util.Random;

public class FamilySimulation {
    public static void main(String[] args) {
        int numTrials = 100000;
        int[] childrenCounts = new int[numTrials];
        Random random = new Random();

        // Probability of having a boy (p). Adjust this value for different scenarios.
        double p = 0.5;

        for (int i = 0; i < numTrials; i++) {
            boolean isFirstChildBoy = random.nextDouble() < p;
            boolean hasSameSexChild = false;
            int childrenCount = 1; // First child is born

            while (!hasSameSexChild) {
                boolean isCurrentChildBoy = random.nextDouble() < p;
                childrenCount++;

                // Check if the current child's sex matches the first child's sex
                if (isCurrentChildBoy == isFirstChildBoy) {
                    hasSameSexChild = true;
                }
            }

            childrenCounts[i] = childrenCount;
        }

        double totalChildren = 0;
        int count2 = 0, count3 = 0, count4 = 0, count5AndAbove = 0;

        for (int count : childrenCounts) {
            totalChildren += count;
            if (count == 2) {
                count2++;
            } else if (count == 3) {
                count3++;
            } else if (count == 4) {
                count4++;
            } else if (count >= 5) {
                count5AndAbove++;
            }
        }

        double averageChildren = totalChildren / numTrials;

        System.out.println("Estimated chapter1.section5.examples.Average Number of Children: " + averageChildren);
        System.out.println("Frequency of 2 Children: " + count2);
        System.out.println("Frequency of 3 Children: " + count3);
        System.out.println("Frequency of 4 Children: " + count4);
        System.out.println("Frequency of 5 and Above Children: " + count5AndAbove);
    }
}
