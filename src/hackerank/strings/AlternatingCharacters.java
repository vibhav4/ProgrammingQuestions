package hackerank.strings;

import java.util.Stack;

public class AlternatingCharacters {

    /*
    You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

Your task is to find the minimum number of required deletions.
     */


    public static void main(String args[]){
     String ss = "AAABBB";
        alternatingCharacters(ss);
        alternatingCharacters1(ss);
    }

    static int alternatingCharacters(String s) {

        String[] aa = s.split("");
        Stack stack = new Stack();
        int counter = 0;
        for (int i = 0; i < aa.length; i++) {
            if (stack.empty()) {
                stack.push(aa[i]);
            } else if (stack.peek().toString().equalsIgnoreCase(aa[i])) {
                counter++;
            } else {
                stack.push(aa[i]);
            }
        }
        System.out.println("stack method " + counter);
        return counter;
    }

    static int alternatingCharacters1(String s) {

        int counter = 0;
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
