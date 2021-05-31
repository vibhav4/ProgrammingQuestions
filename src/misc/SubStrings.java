package misc;

public class SubStrings {

    public static void main(String args[]){

        String test = "sdcsd";

        System.out.println(test.length());

        int counter = 0;
        for (int i = 0; i < test.length(); i++) {
            for (int j = i + 1; j <= test.length(); j++) {
                System.out.println(test.substring(i, j));
                counter++;
            }
        }

        System.out.println(counter);
    }
}
