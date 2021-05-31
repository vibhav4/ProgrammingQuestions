package luvBabbar450;

import java.util.Arrays;

public class Sort012_Prob4 {

    // Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

    public static void main(String args[]){

        int[] arr = {1,1,1,1,0,0,0,0,2,2,2,1,1,1};
        sort012(arr);

    }

    public static void sort012(int[] arr){

//        Arrays.sort(arr);
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int[] sortArr = new int[arr.length];

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==0){
                a1++;
            }
            if(arr[i]==1){
                a2++;
            }
            if(arr[i]==2){
                a3++;
            }
        }

        for(int i = 0 ; i<a1 ; i++){
            sortArr[i] = 0;
        }

        for(int i = a1 ; i<a1 + a2 ; i++){
            sortArr[i] = 1;
        }

        for(int i = a1 + a2 ; i<arr.length ; i++){
            sortArr[i] = 2;
        }

        System.out.println(Arrays.toString(sortArr));
    }
}
