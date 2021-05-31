package luvBabbar450;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kthsmallest_Prod3 {

    public static void main(String args[]){

        int[] arr = {6,7,8,9,1,2,3,4};
        int k = 4;
        kthSmallest(arr,arr.length,k);

    }

    public static int kthSmallest(int[] arr, int size , int k)
    {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        for(int i = 0 ; i<arr.length ; i++){
            if(i<k) {
                pq.add(arr[i]);
            } else {
               if(pq.peek()>arr[i]){
                   pq.poll();
                   pq.add(arr[i]);
               }
            }
        }


        return pq.peek();
    }
}
