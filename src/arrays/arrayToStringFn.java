package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayToStringFn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));

        String[] str = new String[4];

        for(int i=0; i< str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }



}
