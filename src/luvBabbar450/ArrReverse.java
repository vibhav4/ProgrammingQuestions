package luvBabbar450;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrReverse {

    public static void main(String args[]){

//        int arr[] = {1, 2, 3};
//        int revArr[] = new int[arr.length];
//        int counter = 0;
//
//        for(int i = arr.length-1 ; i >= 0 ; i--){
//            revArr[counter] = arr[i];
//            counter++;
//        }
//
//        System.out.println(Arrays.toString(revArr));


        String s = "Gedks";
        reverseWord(s);
    }

    public static String reverseWord(String str)
    {
        String revString = "";
        for(int i = str.length() - 1 ; i>=0 ; i--){
            revString = revString + str.charAt(i);
        }

        return revString;
    }
}
