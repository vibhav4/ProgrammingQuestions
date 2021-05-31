package hackerank.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockSolution {

    // Complete the sockMerchant function below.
    static void sockMerchant(int n, int[] ar) {

        HashMap<Integer,Integer> allData = new HashMap<Integer,Integer>();

        for(int i = 0;i<ar.length;i++){
            if(allData.get(ar[i])==null){
                allData.put(ar[i],1);
            } else {
                allData.put(ar[i],allData.get(ar[i])+1);
            }
        }

        int result=0;

        for(Map.Entry ee : allData.entrySet()){
            result = result + (Integer.parseInt(ee.getValue().toString())/2);
        }

        System.out.println(result);



        // one possible Raw logic
//        int count = 0;
//        for(int i=0; i<n; i++){
//            if(c[i]!=0){
//                for(int j=i+1; j<n; j++){
//                    if(c[i]==c[j]){
//                        count++;
//                        c[j]=0;
//                        break;
//                    }
//                }
//            }
//        }
//        printf("%d", count);


        // using Set
//        Set<Integer> colors = new HashSet<>();
//        int pairs = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (!colors.contains(c[i])) {
//                colors.add(c[i]);
//            } else {
//                pairs++;
//                colors.remove(c[i]);
//            }
//        }
//
//        System.out.println(pairs);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/test.txt"));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        int[] ar = new int[5];

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

//        int result = sockMerchant(n, ar);

        sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

}
