package BinerarySearch;

import java.util.Arrays;

public class firstAndLastPosition {

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println("Output: " + Arrays.toString(searchRange(nums1, target1)));

        // Example 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println("Output: " + Arrays.toString(searchRange(nums2, target2)));

        // Example 3
        int[] nums3 = {};
        int target3 = 0;
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println("Output: " + Arrays.toString(searchRange(nums3, target3)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // Find the first occurrence of the target
        int start = search(nums, target, true);
        if (start == -1) {
            return ans; // If start is -1, target is not present
        }

        // Find the last occurrence of the target
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;

                // Narrow search to find the first or last occurrence
                if (findStartIndex) {
                    end = mid - 1; // Look for earlier occurrence
                } else {
                    start = mid + 1; // Look for later occurrence
                }
            }
        }

        return ans;
    }
}
