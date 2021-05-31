package misc;

public class Ass1 {

    /**
     Given a string of odd length, return the middle 3 characters from the string,
     so the string <b>"Monitor"</b> yields <b>"nit"</b>.
     If the string length is less than 3, return the string as is. <br> <br>

     <b>EXPECTATIONS:</b><br>
     middleThree("bunny") <b>---></b> "unn" <br>
     middleThree("peter") <b>---></b> "ete" <br>
     middleThree("Jamaica") <b>---></b>"mai" <br>
     */

    public static String middleThree(String str) {

        int middleIndex = (str.length() + 1)/2;

        String result = str.substring(middleIndex-2,middleIndex+1);
        return result;
    }

    public static void main(String args[]){
//        TestingUtils.runTests();
        System.out.println(middleThree("aaaabbbaaaa"));
    }


}
