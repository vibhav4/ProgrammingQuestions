package algorithms.recursion;

import java.sql.SQLOutput;

public class App {

    public static void main(String args[]){
//        reduce(10);

        int[] arr = {10, 7, 9, 3, 4, 5, 6, 7, 0};
        System.out.println(recusriveLinearSearch(arr,0,9));
    }

    public static void reduce(int n){
        if(n>=0) {
            System.out.println("Current value - " + n);
            reduce(n - 1);
            System.out.println("After value - " + n);
        }
    }

    public static int recusriveLinearSearch(int[] a, int i, int x) {

        if (i > a.length - 1) {
            return -1;
        } else if (a[i] == x) {
            return i;
        } else {
            return recusriveLinearSearch(a, i + 1, x);
        }
//        return -1;
    }
}
