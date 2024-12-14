package arrays.InterviewPrep;

// Method 1: In-Place Reversal (Two-Pointer Approach)
// Time Complexity: O(n)
public class ReverseArray {
    public static void reverseInPlace(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Method 2: Using a New Array
    // Time Complexity: O(n), Space Complexity: O(n)
    public static int[] reverseWithNewArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method 3: Using Collections Framework (for Integer Arrays)
    // Time Complexity: O(n)
    public static void reverseUsingCollections(Integer[] arr) {
        java.util.Collections.reverse(java.util.Arrays.asList(arr));
    }

    // Method 4: Recursive Approach
    // Time Complexity: O(n), Space Complexity: O(n) due to recursion stack
    public static void reverseRecursively(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseRecursively(arr, left + 1, right - 1);
    }

    // Main Method to Test All Approaches
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Test Method 1
        reverseInPlace(arr);
        System.out.println("Reversed (In-Place): " + java.util.Arrays.toString(arr));

        // Reset Array
        arr = new int[]{1, 2, 3, 4, 5};

        // Test Method 2
        int[] newArray = reverseWithNewArray(arr);
        System.out.println("Reversed (New Array): " + java.util.Arrays.toString(newArray));

        // Test Method 3
        Integer[] integerArray = {1, 2, 3, 4, 5};
        reverseUsingCollections(integerArray);
        System.out.println("Reversed (Collections): " + java.util.Arrays.toString(integerArray));

        // Test Method 4
        arr = new int[]{1, 2, 3, 4, 5};
        reverseRecursively(arr, 0, arr.length - 1);
        System.out.println("Reversed (Recursively): " + java.util.Arrays.toString(arr));
    }
}
