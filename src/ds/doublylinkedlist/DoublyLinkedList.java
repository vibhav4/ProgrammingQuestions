package ds.doublylinkedlist;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode; // if empty , last will refer to the new node bieng created
        } else {
            first.previous = newNode;
        }
        newNode.next = first; // the new node next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode; // assigning old last to new node
            newNode.previous = last;// old last will be the new node previous
        }
//        newNode.previous=last;
        this.last = newNode; // linked list last field should point to the new node
    }


    // assume non empty list

    public Node deleteFirst() {
        Node temp = first;
        if(first.next==null){  // there is one item in the list
            last =null;
        } else {
            first.next.previous=null; //the lists first node will point to null backwards
        }
        first = first.next; //
//        first.previous=null;
        return temp;
    }

    // assume non empty list

    public Node deleteLast(){
        Node temp = last;
        if(first.next==null){
            first=null;
        } else {
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }

    // assumes non empty list

    public boolean insertAfter(int key ,int data){
        Node current = first; // we start beginning of the list
        while(current.data!=key){
            current=current.next;
            if(current.next==null){
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data=data;

        if(current==last){
            current.next =null; // debatable
            last=newNode;
        } else {
            newNode.next=current.next; //newnode next field should point to the node ahead of the current node
            current.next.previous=newNode; // the node ahead of current , it's previous field should point to the new node
        }
            newNode.previous=current;
            current.next=newNode;
            return true;
    }

    // assumes non empty list

    public Node deletekey(int key){
        Node current = first;
        while(current.data!=key){
            current=current.next;
            if(current==null){
                return null;
            }
        }

        if(current==first){
            first=current.next;
        } else{
            current.previous.next=current.next;
        }

        if(current==last){
            last=current.previous;
        } else{
            current.next.previous=current.previous;
        }
        return current;
    }

    public void displayForward(){
            Node current = first;
            while(current!=null){
                current.displayNode();
                current=current.next;
            }
    }

    public void displayBackward(){
        Node current = last;
        while(current!=null){
            current.displayNode();
            current=current.previous;
        }
    }



}
