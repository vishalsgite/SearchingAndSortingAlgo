package LinearSearchAlgo;

public class firstProgramForLinearsearch {

    public static void main(String[] args) {

        int[] arr = {4,2,7,1,9,0,-1};
        int target = -1;

        int answer1 = searchInTheArray(arr,target);
        System.out.println(answer1);

        int answer2 = searchInTheArray2(arr,target);
        System.out.println(answer2);

        boolean answer3 = searchInTheArray3(arr,target);
        System.out.println(answer3);
    }

    //Search In The Array :
    //return the index , if item found else return -1

    static int searchInTheArray(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        //run for --> for loop
        for(int index=0; index< arr.length; index++){

            //check for every element at every index if is equal to target

            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }


    static int searchInTheArray2(int[] arr,int target){

        //By Inhancing for each loop , return element not index
        for (int element : arr){
            if(element == target){
                return element;
            }

        }
        return Integer.MAX_VALUE;  //here we didn't return -1 ,because -1 can be element present in array . so it will create ambiguity problem
    }

    static boolean searchInTheArray3(int[] arr,int target){

        //By Inhancing for each loop , return element not index
        for (int element : arr){
            if(element == target){
                return true;
            }

        }
        return false;
    }
}
