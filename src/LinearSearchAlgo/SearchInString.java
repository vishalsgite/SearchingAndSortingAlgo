package LinearSearchAlgo;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Vishal";

        System.out.println(Arrays.toString(name.toCharArray()));

        char charTosSearch = 'V';

        boolean answer = searchCharInString(name,charTosSearch);
        System.out.println(answer);

        boolean answer2 = searchCharInString2(name,charTosSearch);
        System.out.println(answer2);

        int answer3 = searchCharInString3(name,charTosSearch);
        System.out.println(answer3);
    }

    static boolean searchCharInString(String str , char charTosSearch){

        if(str.isEmpty()){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == charTosSearch){
                return true;
            }
        }
        return false;

    }

    static boolean searchCharInString2(String str , char charTosSearch){
        for(char ch : str.toCharArray()){
            if(ch == charTosSearch){
                return true;
            }
        }
return false;
    }

    static int searchCharInString3(String str , char charTosSearch){
        if(str.isEmpty()){
            return -1;
        }

        for(int index=0; index<str.length(); index++){
            if(charTosSearch == str.charAt(index)){
                return index;
            }
        }
return -1;
    }

}
