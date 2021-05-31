package hackerank.arrays;

import java.io.IOException;

public class CloudSolution {

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
        int[] c = new int[]{0,0,0,1,0,0};
//
//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }

        int result = jumpingOnClouds(c);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }

    static int jumpingOnClouds(int[] c) {

//        int i=0;

//        while(i<=c.length-2){
//            int steps = 0;
//            if(c[i+1]==1 && c[i+2]==0 ){
//                steps=2;
//                jump++;
//            } else if(c[i+1]==0 && c[i+2]==0){
//                steps=2;
//                jump++;
//            } else if(c[i+1]==0 && c[i+2]==1){
//                steps=1;
//                jump++;
//            }
//            i = i + steps;
//        }

        int jump =0 ;
        for(int i = 0;i<c.length-1;i++){
            jump++;
            if(i<c.length-2 && c[i+2]==0){
                i++;
            }
        }

        return jump;
//        int count = 0;
//        for (int i = 0; i < n - 1; i++) {
//            if (c[i] == 0)
//            {i++;}
//            count++;
//        }
//        System.out.println(count);


//        return jump;
    }

}
