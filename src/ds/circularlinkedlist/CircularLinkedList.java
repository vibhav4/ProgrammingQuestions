package ds.circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList(){
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;

        if(isEmpty()){
            last=newNode;
        }
        newNode.next=first;
        first=newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()){
            first=newNode;
        }
        last.next=newNode; // next value of last node will point to the new node
        last = newNode; // we make the new node we created be the last one in the list
    }

    public int deleteFirst(){
        Node tmp = first;
        if(first.next==null){
            last=null;
        }
        first=first.next; // first will point to the old first next value
        return tmp.data;
    }

    public void displayList(){
        System.out.println("Full listy");
        Node current=first;
        while(current!=null) {
            current.displayNode();
//            System.out.println(current.data);
            current=current.next;
        }
    }


}
