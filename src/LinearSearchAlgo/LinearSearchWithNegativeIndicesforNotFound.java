package LinearSearchAlgo;

public class LinearSearchWithNegativeIndicesforNotFound {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1; // Use negative index to signify not found
        }

        public static void main(String[] args) {
            int[] arr = {9, 8, 7, 6, 5};
            int target = 10;
            int result = linearSearch(arr, target);
            System.out.println("Result: " + result); // Output: -1
        }
    }
