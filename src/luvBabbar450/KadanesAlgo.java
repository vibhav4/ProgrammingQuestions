package luvBabbar450;

import java.util.Arrays;

public class KadanesAlgo {

    //Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
    // formula for sub arrays (n * (n+1))/2

    public static void main(String args[]){

        int[] arr = {2,-3,4,5};
//        subArrays(arr);
        maxSumInContinuousArray(arr);
    }

    public static int maxSumInContinuousArray(int[] arr){

        int maxSum = Integer.MIN_VALUE;
        int sumTillNow = 0;
        int start = 0 , end = 0 , s = 0;

        for(int i =0 ; i<arr.length ; i++){
            sumTillNow = sumTillNow + arr[i];

            if(sumTillNow > maxSum){
                maxSum = sumTillNow;
                start = s;
                end = i;
            }
            if(sumTillNow<0){
                sumTillNow=0;
                s = i+1;
            }
        }

        System.out.println("here");

        return maxSum;

    }



    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }

    static void maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0,start = 0,
                end = 0, s = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + max_so_far);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }

    public static void subArrays(int[] arr){


        Integer maxSum= null;
        int[] finalArr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                int[] newarr = new int[(j-i+1)];
                int counter = 0;
                int sum=0;
                for(int k=i ; k<=j ; k++){
                    newarr[counter] = arr[k];
                    counter++;
                    sum = sum + arr[k];
                }
                if(maxSum==null){
                    maxSum=sum;
                } else {
                    if(sum>maxSum){
                        maxSum=sum;
                        finalArr = newarr;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(finalArr));

    }
}
