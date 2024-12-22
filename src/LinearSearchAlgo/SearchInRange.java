package LinearSearchAlgo;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {14, 44, 52, 76, 89, 12, 40,};
        int key = 40;

        int answer = searchElement(arr,key,2,5);

        System.out.println(answer);


    }
     static int searchElement(int[] arr, int key,int start , int end ) {

        for (int index = start; index <= end; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;

    }
}
