package LinearSearchAlgo;

public class LinearSearchInStringArray {
        public static int linearSearch(String[] arr, String target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            String[] arr = {"apple", "banana", "cherry"};
            String target = "banana";
            int result = linearSearch(arr, target);
            System.out.println("Found at index: " + result); // Output: 1
        }
    }
