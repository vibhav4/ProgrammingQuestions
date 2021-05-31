package algorithms.linearsearch;

public class LinearSearch {

    public static void main(String args[]) {


        int[] arr = {10, 7, 9, 3, 4, 5, 6, 7, 0};



        int searchVal = 7;

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==searchVal){
                result=i;
//                break;
            }
        }

        System.out.println("Answer is - " + result);
    }
}

