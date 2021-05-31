package ds.circularlinkedlist;

public class App {

    public static void main(String args[]) {
//
        CircularLinkedList mylist = new CircularLinkedList();
        mylist.insertFirst(12);
        mylist.insertFirst(5);
        mylist.insertFirst(52);
        mylist.insertFirst(33);

        mylist.insertLast(345678);
//TODO : Implement stack and queue using circular linked list as underlying satastructure
        mylist.displayList();

    }
}
