package LinearSearchAlgo;

public class LinearSearchWithReturnMessage {
        public static String linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return "Found at index: " + i;
                }
            }
            return "Not found";
        }

        public static void main(String[] args) {
            int[] arr = {5, 10, 15, 20};
            int target = 15;
            String result = linearSearch(arr, target);
            System.out.println(result); // Output: Found at index: 2
        }
    }
