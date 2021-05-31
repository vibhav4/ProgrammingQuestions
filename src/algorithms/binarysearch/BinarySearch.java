package algorithms.binarysearch;

public class BinarySearch {

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchPrac(9,arr));
    }


// Binary search implementation
    static int binarySearchPrac(int x, int[] a){
        int p = 0;
        int r= a.length-1;
        while(p<=r){
            int q = (int) Math.floor((p+r)/2);
            if(a[q]==x){
                return q;
            } else if(a[q]>x){
                r = q-1;
            } else {
                p= q+1;
            }
        }
        return -1;
    }
}
