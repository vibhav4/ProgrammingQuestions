package luvBabbar450;

import java.util.Arrays;

public class NegativeOneSide_Prob5 {

    // An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

    public static void main(String args[]){

        int[] arr = {-2,-5,-5,3,1,5,7,-45};
        negativeOnOneSide(arr);
    }

    public static void negativeOnOneSide(int[] arr){

        int[] newArr = new int[arr.length];
        int min=0;
        int max= arr.length-1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<0){
                newArr[min]=arr[i];
                min++;
            } else {
                newArr[max] = arr[i];
                max--;
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
