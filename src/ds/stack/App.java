package ds.stack;

public class App {

//    Stack ss = new Stack(10);
    public static void main(String[] args) {

//        Stack ss = new Stack(10);
//        try {
//            ss.push(21);
//            ss.push(31);
//            ss.push(41);
//            ss.push(51);
//        } catch(Exception e){
//            System.out.println(e);
//        }
//        System.out.println(ss);
//        while(!ss.isEmpty()){
//            long value = ss.pop();
//            System.out.println(value);
//        }
        reverseString("raaj");
    }

    public static String reverseString(String str){
        int size = str.length();
        Stack ss = new Stack(size);
        String rstr="";
        char[] cc = new char[size];
        cc = str.toCharArray();

        for(int i=0;i<cc.length;i++){
            ss.push(cc[i]);
        }

        while(!ss.isEmpty()){
            char value = ss.pop();
            rstr = rstr + value;
//            System.out.println(value);
        }
        System.out.println("reversed string is - " + rstr);
        return str;
    }
}
