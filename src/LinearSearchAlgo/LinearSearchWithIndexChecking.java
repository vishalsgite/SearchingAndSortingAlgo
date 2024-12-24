package LinearSearchAlgo;

public class LinearSearchWithIndexChecking {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            throw new IllegalArgumentException("Element not found");
        }

        public static void main(String[] args) {
            int[] arr = {25, 45, 65, 85};
            int target = 45;
            try {
                int result = linearSearch(arr, target);
                System.out.println("Element found at index: " + result); // Output: 1
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
