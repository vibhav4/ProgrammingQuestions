package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {1,3,4,2};
        selectionSort(arr);
    }

    public static int[] selectionSort(int[] arr){
        int[] sortedArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int flag = i;
            for(int j = i +1 ; j<arr.length;j++){
                if(arr[j]<arr[flag]){
                    flag = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[flag];
            arr[flag]=temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
