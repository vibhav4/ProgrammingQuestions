package ds.linkedlists;

public class App {


    public static void main(String args[]) {
        Node a = new Node();
        a.data = 4;

        Node b = new Node();
        b.data = 8;

        Node c = new Node();
        c.data = 12;

        Node d = new Node();
        d.data = 16;

        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(listLenght(a));
        System.out.println(listLenght(b));

    }

    public static int listLenght(Node x){
        int lencoun=0;
        Node currnode = x;
        while(currnode!=null){
            lencoun++;
            currnode=currnode.next;
        }
        return lencoun;
    }
}
