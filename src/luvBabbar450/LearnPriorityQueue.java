package luvBabbar450;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class LearnPriorityQueue {

    public static void main(String args[]){

        PriorityQueue<String> pq = new PriorityQueue<String>();
        ArrayList<MinMaxArray.Pair> aa = new ArrayList<>();

        Collections.sort(aa);
//        Arrays.sort

//        TreeSet
        pq.add("kiwi");
        pq.add("apple");
        pq.add("banana");
        pq.add("mango");

        System.out.println(pq);

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

    }

}
