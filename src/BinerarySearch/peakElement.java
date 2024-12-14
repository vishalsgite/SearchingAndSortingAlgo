package BinerarySearch;

//Leetcode problem no 152 findPeakElement

class peakElement {
        public static int findPeakElement(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;

                // Compare middle element with its next element
                if (arr[mid] > arr[mid + 1]) {
                    // If mid element is greater, the peak lies on the start side (including mid)
                    end = mid;
                } else {
                    // If mid element is smaller, the peak lies on the end side
                    start = mid + 1;
                }
            }

            // When start == end, we have found the peak element
            return start;
        }

    public static void main(String[] args) {
            int[] arr = {1,2,1,3,5,6,4};

        findPeakElement(arr);
    }
    }
