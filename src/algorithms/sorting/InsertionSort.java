package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr = {3,5,4,1};
        insertionSort2(arr);

    }

    public static int[] insertionSort(int[] arr){

        for(int i = 1;i<arr.length;i++){
            int element = arr[i];
            int j = i-1;
            while(j>=0){
                if(arr[j]>element) {
                    arr[j + 1] = arr[j];
                    arr[j] = element;
                }
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static int[] insertionSort2(int[] arr){

        for(int i = 1;i<arr.length;i++){
            int element = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>element){
                    arr[j + 1] = arr[j];
                    j--;
            }
            arr[j+1]=element;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
