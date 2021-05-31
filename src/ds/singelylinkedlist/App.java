package ds.singelylinkedlist;

public class App {

    public static void main(String args[]){
        SinglyLinkedList mylist = new SinglyLinkedList();
        mylist.insertFirst(12);
        mylist.insertFirst(5);
        mylist.insertFirst(52);
        mylist.insertFirst(33);

        mylist.insertLast(345678);
//TODO : increase efficiency of insertlast method by introducing another variable
        mylist.displayList();

    }
}
