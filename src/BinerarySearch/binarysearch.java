package BinerarySearch;

public class binarysearch {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2; // Recalculate mid in each iteration

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        // If we exit the loop, the element was not found
        return -1;
    }


    static int binarySearchFirstOccurence(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1; // To store the index of the target

        while (start <= end) {
            int mid = start + (end - start) / 2; // Recalculate mid in each iteration

            if (arr[mid] == target) {
                ans = mid; // Store the index of the found target
                // Continue searching in the left half if looking for the first occurrence
                if (isFirst) {
                    end = mid - 1;
                } else { // Continue searching in the right half if looking for the last occurrence
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans; // Return the first/last occurrence index or -1 if not found
    }



    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,4,5,5,8,9,78,79,89};
        int result =  binarySearch(arr,5);
        int result1 = binarySearchFirstOccurence(arr,4,false);
        System.out.println(result1 == -1 ? "Element Not Found " : "Element Found At Index :"+result1);

    }
}
