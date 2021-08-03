package luvBabbar450;

import java.util.Arrays;

public class RotateArrayClockwise {

    public static int[] farr = new int[5];

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5};
        farr=arr;
        for(int i = 0 ; i<1 ; i++) {
            rotate(farr);
        }
        System.out.println(Arrays.toString(farr));
    }

    public static void rotate(int[] arr){
        int[] Newarr = new int[arr.length];
        int lenght = arr.length;
        int var;

        for (int i = 0; i < lenght; i++) {
            if (i != lenght - 1) {
                Newarr[i + 1] = arr[i];
            } else {
                Newarr[0] = arr[i];
            }
        }
        farr=Newarr;
//        System.out.println("here");
    }
}
