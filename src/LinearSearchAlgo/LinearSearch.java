package LinearSearchAlgo;

public class LinearSearch {

    public static int searchElement(int[] arr, int key) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == key) {
                return index;
            }
        }
        return -1;

    }

    public static boolean searchString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                System.out.println(index+1);
                return true;
            }
        }
        return false;
    }

    //another way
    public static boolean searchStringAnotherWay(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 2, 4,};
        String str = "VISHAL";
        char ch = 'N';

        int ans = searchElement(arr, 9);
        System.out.println(ans);

        boolean ans1 = searchString(str,ch);
        System.out.println(ans1);

        boolean ans2 = searchStringAnotherWay(str,ch);
        System.out.println(ans2);

    }
}

