package hackerank.strings;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AnagramCreation {



    /*
    A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

The student decides on an encryption scheme that involves two large strings. The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.

Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
     */



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String a = scanner.nextLine();
//
//        String b = scanner.nextLine();

        String a = "cde";
        String b = "abc";

        int res = makeAnagram(a, b);

//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }


    static int makeAnagram(String a, String b) {
        int counter = 0;
        String[] arra = a.split("");
        String[] arrb = b.split("");
        List<String> aL = Arrays.asList(arra);
        List<String> bL = Arrays.asList(arrb);
        List<String> parentList = new ArrayList<String>();
        List<String> childList = new ArrayList<String>();
        if(aL.size()> bL.size()){
            parentList.addAll(aL);
            childList.addAll(bL);
        } else {
            parentList.addAll(bL);
            childList.addAll(aL);
        }

        AtomicInteger flag = new AtomicInteger();
        parentList.forEach(element -> {
            if(childList.contains(element)){
                childList.remove(element);
            } else {
                flag.set(flag.get() + 1);
            }
        });
        flag.set(flag.get() + childList.size());

        return flag.get();
    }

//    public static int numberNeeded(String first, String second) {
//        int[] freq = new int[26];
//        first.chars().forEach((c) -> {
//            freq[c - 97]++;
//        });
//        second.chars().forEach((c) -> {
//            freq[c - 97]--;
//        });
//        return Arrays.stream(freq).map(Math::abs).sum();
//    }


}
