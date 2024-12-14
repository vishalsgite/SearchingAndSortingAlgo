package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {8,9}
        };

        System.out.println(arr);

        int[][] arr1 = new int[3][3];

        //Input

        for(int rows = 0 ; rows < arr1.length ; rows++){
            for(int columns = 0; columns < arr1[rows].length; columns++) {
                arr1[rows][columns] = sc.nextInt();
            }

        }
        //Output
     for (int rows = 0 ; rows < arr.length; rows++){
         System.out.println(Arrays.toString(arr[rows]));
     }


     for(int rows = 0 ; rows < arr1.length; rows ++){
      //   for(int columns = 0 ; columns < arr1[rows].length; columns++){
        //     System.out.print(arr1[rows][columns]+" ");

         System.out.println(Arrays.toString(arr1[rows]));
         }

         System.out.println();
     }



    }



