package arrays.InterviewPrep;

import java.util.Arrays;

public class FindMaxMin {

    // Method 1: Simple Iteration (Time Complexity: O(n))
    public static int[] findMaxMinSimple(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return new int[]{max, min};
    }

    // Method 2: Divide and Conquer (Time Complexity: O(n))
    public static int[] findMaxMinDivideAndConquer(int[] arr, int low, int high) {
        if (low == high) { // Only one element
            return new int[]{arr[low], arr[low]};
        }

        if (high == low + 1) { // Two elements
            int max = Math.max(arr[low], arr[high]);
            int min = Math.min(arr[low], arr[high]);
            return new int[]{max, min};
        }

        int mid = (low + high) / 2;
        int[] left = findMaxMinDivideAndConquer(arr, low, mid);
        int[] right = findMaxMinDivideAndConquer(arr, mid + 1, high);

        int max = Math.max(left[0], right[0]);
        int min = Math.min(left[1], right[1]);

        return new int[]{max, min};
    }

    // Method 3: Using Sorting (Time Complexity: O(n log n))
    public static int[] findMaxMinUsingSorting(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[arr.length - 1], arr[0]};
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, 9, 4};

        // Method 1
        int[] result1 = findMaxMinSimple(arr);
        System.out.println("Method 1 - Simple Iteration:");
        System.out.println("Max: " + result1[0] + ", Min: " + result1[1]);

        // Method 2
        int[] result2 = findMaxMinDivideAndConquer(arr, 0, arr.length - 1);
        System.out.println("Method 2 - Divide and Conquer:");
        System.out.println("Max: " + result2[0] + ", Min: " + result2[1]);

        // Method 3
        int[] result3 = findMaxMinUsingSorting(arr);
        System.out.println("Method 3 - Using Sorting:");
        System.out.println("Max: " + result3[0] + ", Min: " + result3[1]);
    }
}
