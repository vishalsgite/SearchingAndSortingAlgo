package arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumDifference {


    public static List<List<Integer>> minDifference(int[] array) {
        List<List<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

//Sort the array
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

//finding Min Difference among all values

        for(int i=1; i<array.length; i++){               // 2,4,5,8,9,11,12
            if((array[i] - array[i-1] < minDiff))
                minDiff = array[i] - array[i-1];
        }

//Find all possible pairs with Min Differnece

        for (int i=1 ; i<array.length; i++){
            if((array[i] - array[i -1 ]) == minDiff){
    List<Integer> temp = new ArrayList<>();
    temp.add(array[i-1]);
    temp.add(array[i]);
    ans.add(temp);

            }

        }
        return ans;

    }




    public static void main(String[] args) {

        int[] array = {12, 9, 8, 2, 11,5,4};
        List<List<Integer>> ans  = minDifference(array);

        System.out.println(ans);

    }
}
