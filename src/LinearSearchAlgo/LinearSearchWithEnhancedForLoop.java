package LinearSearchAlgo;

public class LinearSearchWithEnhancedForLoop {
        public static int linearSearch(int[] arr, int target) {
            int index = 0;
            for (int num : arr) {
                if (num == target) {
                    return index;
                }
                index++;
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {30, 50, 70, 90};
            int target = 70;
            int result = linearSearch(arr, target);
            System.out.println("Found at index: " + result); // Output: 2
        }
    }
