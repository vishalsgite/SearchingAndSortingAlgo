package LinearSearchAlgo;

public class MinimumAndMaximumNumber {
    public static void main(String[] args) {
        int[] arr = {14, 44, 11, 666666, 89, 12, 40,};
        int answer = findMinimumNumber(arr);
        System.out.println(answer);

        int answer2 = findMaXimumNumber2(arr);
        System.out.println(answer2);
    }

    static int findMinimumNumber(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int min = arr[0];
        for(int index = 1; index < arr.length; index++){

            if(arr[index] < min){
                min = arr[index];
            }
        }
        return min;
    }

    static int findMaXimumNumber2(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for(int index = 1; index < arr.length; index++){

            if(arr[index] > max){
                max = arr[index];
            }
        }
        return max;
    }
}
