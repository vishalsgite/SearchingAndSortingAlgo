package LinearSearchAlgo;

public class CaseWithMultipleOccurrencesOfTarget {
        public static void linearSearch(int[] arr, int target) {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.println("Found at index: " + i);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Not found");
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 7, 3, 5};
            int target = 3;
            linearSearch(arr, target);
        }
    }
