package luvBabbar450;

public class MinMaxArray {

    public static void main(String args[]){

        int[] arr = {3,54,6,7,8,8,9,2,1,1,3,5,6,7,78,8,8};
        Pair p1 = minMax(arr);
        Pair p2 = minMax2(arr);
        System.out.println("here");
    }



    // Sort using insertion sort & then return first & last element
    public static Pair minMax(int[] arr){

        for(int i = 1 ; i<arr.length ; i++){
            int j = i-1;
            int element= arr[i];

            while(j>=0 && arr[j]>element){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = element;
        }

        Pair res = new Pair();
        res.min = arr[0];
        res.max = arr[arr.length-1];
        return res;
    }

    public static Pair minMax2(int[] arr){
        Pair res = new Pair();

        if(arr[0]>arr[1]){
            res.max = arr[0];
            res.min = arr[1];
        } else {
            res.max = arr[1];
            res.min = arr[0];
        }

        for(int i = 2 ; i<arr.length ; i++){
            if(arr[i]>res.max){
                res.max = arr[i];
            } else if(arr[i]<res.min){
                res.min = arr[i];
            }
        }
        return res;
    }


    static class Pair implements Comparable {

        int min;
        int max;

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
}
