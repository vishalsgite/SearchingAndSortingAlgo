package BinerarySearch;

public class CeilingNumber {

    static int findCeilingNumber(int[] arr, int target) {

        //What if target is greater than greatest Number in the array

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int starts = 0;
        int end = arr.length;


        while (starts <= end ){  //Binenary Search Loop  ASC order

            int mid = starts + (end - starts) / 2 ;


            if (arr[mid] == target) {
                return mid; // Exact match is the floor
            }else if(arr[mid] < target)  {  //if target is greater ,element lies in right half
              starts = mid + 1;
            }else  {
                end = mid - 1 ;
            }

        }
return starts;
    }


    public static void main(String[] args) {
        int[] arr = {3,5,8,9,11,14,16,18,19,33,56,78,90};
        int target = 98;
        int ans = findCeilingNumber(arr,target);

        System.out.println(ans);
    }
}

