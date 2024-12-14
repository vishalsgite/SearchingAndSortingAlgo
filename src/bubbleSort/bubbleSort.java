package bubbleSort;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
 int[] arr = {-1,0};
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped ;

        //run the step  'n-1' steps

        for(int i = 0 ; i<arr.length; i++){


            swapped = false;
            //for each step , max item will come at last respective index

            for(int j=1; j < arr.length-i; j++){

                //swap if the item is smaller than the previous item

                if(arr[j] < arr[j-1]){

                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;

                    swapped = true;
                }
            }

            //if you did not swapped , meaning given array is already sorted
            //so , there is no need to swapped again and sort again

            if(!swapped){   //meaning !false = true ;
                break;
            }
        }
    }
}
