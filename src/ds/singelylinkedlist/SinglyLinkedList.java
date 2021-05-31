package ds.singelylinkedlist;

public class SinglyLinkedList {

    private Node first;
//    private Node last;

    public SinglyLinkedList(){

    }

    public boolean isEmpty(){
        return (first==null);
    }

    // used to insert at beggining of the list

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.next=first;
        first = newNode;
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next!=null){
            current=current.next;
        }
        Node newNode = new Node();
        newNode.data=data;
        current.next=newNode;
//        last.next=newNode;
    }

    public Node deleteFirst(){
        Node tmp = first;
        first=first.next;
        return tmp;
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
