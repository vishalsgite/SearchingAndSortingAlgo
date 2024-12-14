package BinerarySearch;



public class BinerarySearchAlgo {
    //return the index
    //return -1 if it does exists

    static int OrderAgnosticBineararySearch(int[] arr , int target){
        int starts = 0 ;
        int end = arr.length-1;

        //check is sort in ASC order or DESC order

        boolean isAsc = arr[starts] < arr[end];


        while (starts <= end){
            //find the middle element
            int mid = starts + ( end - starts) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                 if(target < arr[mid]) {
                     end = mid - 1;
            } else {
                     starts = mid + 1;
                 }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else {
                    starts = mid + 1;
                }
            }
        }return  -1 ;
    }

    public static void main(String[] args) {

        int[] arr = {3,5,8,9,11,14,16,18,19,33,56,78,90};
        int target = 11;
        int ans = OrderAgnosticBineararySearch(arr,target);

        System.out.println(ans);
    }

}
