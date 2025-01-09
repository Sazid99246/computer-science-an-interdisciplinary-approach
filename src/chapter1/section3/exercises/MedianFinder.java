package chapter1.section3.exercises;

public class MedianFinder {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Usage: java MedianFinder <int1> <int2> <int3> <int4> <int5>");
            return;
        }

        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }

        int median = findMedian(nums);
        System.out.println("The median value is: " + median);
    }

    public static int findMedian(int[] nums) {
        // Sort first three numbers to find a pivot
        int a = nums[0], b = nums[1], c = nums[2];
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // Now a <= b <= c
        int d = nums[3], e = nums[4];

        // Insert d into the correct position
        if (d < a) {
            d = c;
            c = b;
            b = a;
            a = nums[3];
        } else if (d < b) {
            d = c;
            c = b;
            b = nums[3];
        } else if (d < c) {
            d = c;
            c = nums[3];
        }

        // Insert e into the correct position
        if (e < a) {
            e = c;
            c = b;
            b = a;
            a = nums[4];
        } else if (e < b) {
            e = c;
            c = b;
            b = nums[4];
        } else if (e < c) {
            e = c;
            c = nums[4];
        }

        // Now the sorted order is a, b, c, d, e
        return c; // Median is the middle value
    }
}
