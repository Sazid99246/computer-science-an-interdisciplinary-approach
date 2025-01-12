package chapter1.section3.webExercises;

import java.util.HashMap;

public class DecimalExpansion {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);

        // Handle integer part
        int integerPart = p / q;
        System.out.print("Decimal Expansion: " + integerPart + ".");

        // Handle fractional part
        StringBuilder fractionalPart = new StringBuilder();
        HashMap<Integer, Integer> remainderMap = new HashMap<>();

        int remainder = p % q;
        int index = 0;
        boolean hasCycle = false;
        int cycleStart = 0;

        while (remainder != 0) {
            // If the remainder repeats, a cycle is detected
            if (remainderMap.containsKey(remainder)) {
                cycleStart = remainderMap.get(remainder);
                hasCycle = true;
                break;
            }

            // Store the position of each remainder
            remainderMap.put(remainder, index);
            remainder *= 10;
            fractionalPart.append(remainder / q);
            remainder %= q;
            index++;
        }

        // Print the result
        if (hasCycle) {
            System.out.print(fractionalPart.substring(0, cycleStart) + "(");
            System.out.print(fractionalPart.substring(cycleStart) + ")");
        } else {
            System.out.print(fractionalPart);
        }
        System.out.println();
    }
}
