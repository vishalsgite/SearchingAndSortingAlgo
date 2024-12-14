package BinerarySearch;

public class floorNumber {

    static int findFloorNumberWithValue(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1; // Use arr.length - 1 since it's zero-indexed

        while (start <= end) {     // Binary search loop ASC order

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Exact match is the floor
            } else if (arr[mid] < target) {

                // Potential floor, continue searching to the right
                start = mid + 1;

            } else {
                // Target is smaller, search to the left
                end = mid - 1;
            }
        }

        return end; // Return the floor value or -1 if no valid floor exists
    }



    public static void main (String[] args){
        int[] arr = {3, 5, 8, 9, 11, 14, 16, 18, 19, 33, 56, 78, 90};
        int target = 2;
        int ans = findFloorNumberWithValue(arr,target);

        System.out.println(ans);

    }


}
