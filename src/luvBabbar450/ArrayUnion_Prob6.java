package luvBabbar450;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayUnion_Prob6 {

    // Given two arrays a[] and b[] of size n and n respectively. The task is to find union between these two arrays.
    //
    //Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.


    public static void main(String args[]){

        int[] arr = {-2,-5,-5,3,1,5,7,-45};
        int[] arr2 = {-2,-5,-5,3,1,5,7,-45,5,6};
        unionArray(arr,arr2);
    }

    public static void unionArray(int[] a , int[] b){

        //String[] movieArray = movies.toArray(new String[movies.size()]);
        //for (int i = 0; i < movieArray.length; i++) {
        //  System.out.println(movieArray[i]);
        //}

        //movies.stream().forEach(movie -> System.out.println(movie));

        // one way is to use set
        int length1=0;

        if(a.length>b.length){
            length1=a.length;
        } else {
            length1=b.length;
        }

        final int[] newArr = new int[length1];

        HashSet<Integer> hh = new HashSet<Integer>();

        for(int i = 0 ; i<a.length ; i++){
            hh.add(a[i]);
        }

        for(int i = 0 ; i<b.length ; i++){
            hh.add(b[i]);
        }

        AtomicInteger k = new AtomicInteger(0);

        hh.stream().forEach((element) -> {
            newArr[k.get()]=element;
            k.getAndIncrement();
        });

        System.out.println(Arrays.toString(newArr));

    }
}
