package LinearSearchAlgo;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {293,474,188},
                {89,7888888,45,87},
                {85,69},
                {74,25,86,34,98}
        };

        int target = 74;

        int[] answer = search(arr,target);
        System.out.println(Arrays.toString(answer));

        int answer2 = maxValue(arr);
        System.out.println(answer2);

        int answer3 = minValue2WithEnhanceForLoop(arr);
        System.out.println(answer3);


    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1};
        }
        for(int row = 0; row < arr.length; row++){
            for(int columns = 0; columns < arr[row].length; columns++){
                 if(arr[row][columns] == target){
                     return new int[]{row,columns};   //here we return like this because , before array is not initialize.here we did

                 }
            }
        }
         return new int[]{-1,-1};
    }
    static  int maxValue(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int row=0; row<arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                if(arr[row][column] > max){
                    max = arr[row][column];
                }
            }
        }
        return max;
    }
    static  int minValue2WithEnhanceForLoop(int[][] arr){
        int min = Integer.MAX_VALUE;

        for (int[] ints : arr) {
            for (int column = 0; column < ints.length; column++) {
                if (ints[column] < min) {
                    min = ints[column];
                }
            }
        }
        return min;
    }
}
