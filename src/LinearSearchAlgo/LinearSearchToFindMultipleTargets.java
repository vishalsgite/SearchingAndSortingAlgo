package LinearSearchAlgo;

public class LinearSearchToFindMultipleTargets {
        public static void linearSearch(int[] arr, int target) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.println("Found at index: " + i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Target not found");
            }
        }

        public static void main(String[] args) {
            int[] arr = {5, 7, 9, 5, 3};
            int target = 5;
            linearSearch(arr, target);
        }
    }
