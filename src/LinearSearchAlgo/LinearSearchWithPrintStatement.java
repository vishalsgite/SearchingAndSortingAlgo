package LinearSearchAlgo;

public class LinearSearchWithPrintStatement {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Checking element at index: " + i);
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50};
            int target = 40;
            int result = linearSearch(arr, target);
            System.out.println("Found at index: " + result);
        }
    }
