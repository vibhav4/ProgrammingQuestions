package hackerank.strings;

import java.util.*;

public class ValidString {

    /*
    Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just  character at  index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.


     */

    public static void main(String args[]){
        //aaaabbcc
        //aaaaabc
        //aabbccddeefghi

        String ss = "aaaaaa";
        String ssd = isValid(ss);
        System.out.println("Final result " + ssd);

    }

    static String isValid(String s) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        String[] ss = s.split("");

        for(String element : ss){
            if(hm.containsKey(element)){
                hm.put(element,hm.get(element)+1);
            } else {
                hm.put(element,1);
            }
        }

        int[] arr = new int[hm.size()];
        int idx = 0;
        for(Integer i : hm.values()){
            arr[idx++]=i;
        }

        Arrays.sort(arr);

        if (hm.size() == 1) return "YES";

        int first = arr[0];
        int second = arr[1];
        int secondLast = arr[arr.length - 2];
        int last = arr[arr.length - 1];


        // If first and last are same, then all frequencies are same
        if (first == last) return "YES";

        // If first is 1, and all other characters have 1 frequency
        if (first == 1 && second == last) return "YES";

        // If all are same and last character has just 1 extra count
        if (first == second && second == secondLast && secondLast == (last - 1)) return "YES";


        return "NO";
    }

}
