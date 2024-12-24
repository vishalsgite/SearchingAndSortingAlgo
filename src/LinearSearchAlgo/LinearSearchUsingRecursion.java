package LinearSearchAlgo;

public class LinearSearchUsingRecursion {
        public static int linearSearch(int[] arr, int target, int index) {
            if (index >= arr.length) {
                return -1;
            }
            if (arr[index] == target) {
                return index;
            }
            return linearSearch(arr, target, index + 1);
        }

        public static void main(String[] args) {
            int[] arr = {12, 24, 36, 48};
            int target = 36;
            int result = linearSearch(arr, target, 0);
            System.out.println("Found at index: " + result); // Output: 2
        }
    }
