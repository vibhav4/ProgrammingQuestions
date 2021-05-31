package hackerank.strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CommonChild {

    /*
    A string is said to be a child of a another string if it can be formed by deleting 0 or more characters from the other string. Letters cannot be rearranged. Given two strings of equal length, what's the longest string that can be constructed such that it is a child of both?

Example



These strings have two children with maximum length 3, ABC and ABD. They can be formed by eliminating either the D or C from both strings. Return .
     */

    public static void main(String args[]){

        String s1 = "ABCD";
        String s2 = "ABDC";

        commonChld(s1,s2);
    }

    public static int commonChld(String s1, String s2){

        String[] s1arr = s1.split("");
        String[] s2arr = s2.split("");

        HashSet<String> set1 = new HashSet<String>();

        HashSet<String> set2 = new HashSet<String>();

        for(int i = 0 ; i<s1.length() ; i++){
            for(int j = i + 1 ; j<=s1.length() ; j++){
                set1.add(s1.substring(i,j));
            }
        }

        for(int i = 0 ; i<s2.length() ; i++){
            for(int j = i + 1 ; j<=s2.length() ; j++){
                set2.add(s2.substring(i,j));
            }
        }

        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        set1.forEach(
                element -> {
                    if(set2.contains(element)){
                        treeSet.add(element.length());
                    }
                    set2.contains(element);

                }
        );

        Iterator<Integer> it = treeSet.descendingIterator();

        System.out.println(it.next());
        return it.next();
    }

}
