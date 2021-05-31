package hackerank.arrays;

import java.io.IOException;

public class ValleySolution {


    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv(System.getProperty("user.dir") + "/test.txt")));
//
//        int steps = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String path = bufferedReader.readLine();

        int steps = 8;
        String path = "UDDDUDUUUDDU";

        int result = countingValleys(steps, path);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

    }

    public static int countingValleys(int steps, String path) {
        // Write your code here

        int result = 0;
        int seaFlag = 0;
        char[] arr = path.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='U'){
                seaFlag++;
                if(seaFlag==0){
                    result++;
                }
            } else {
                seaFlag--;
            }
        }

        return result;

        // slightly better way

//        int v = 0;     // # of valleys
//        int lvl = 0;   // current level
//        for(char c : s.toCharArray()){
//            if(c == 'U') ++lvl;
//            if(c == 'D') --lvl;
//
//            // if we just came UP to sea level
//            if(lvl == 0 && c == 'U')
//                ++v;
//        }
    }

}
