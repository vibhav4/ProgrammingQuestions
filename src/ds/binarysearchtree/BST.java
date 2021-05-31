package ds.binarysearchtree;

public class BST {

    private Node root;

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {

            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) { // Its parent is the leaf node
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }
    }

    public Node findMin() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public boolean remove(int key){

        Node currentNode= root;
        Node parent=root;

        boolean isLeftChild = false;

        while(currentNode.key!=key){
            parent=currentNode;
            if(key<currentNode.key){
                isLeftChild=true;
                currentNode=currentNode.leftChild;
            } else {
                currentNode=currentNode.rightChild;
                isLeftChild=false;
            }

           if(currentNode==null) return false;
        }

        // found the node

        Node nodeToBeDeleted = currentNode;


        // if node is a leaf

        if(nodeToBeDeleted.leftChild==null && nodeToBeDeleted.rightChild==null){
            if(nodeToBeDeleted==root){
                root=null;
            } else if(isLeftChild){
                parent.leftChild=null;
            } else{
                parent.rightChild=null;
            }
        }
        // if node has one child that is left child
        else if(nodeToBeDeleted.rightChild==null){
            if(nodeToBeDeleted==root){
                root=nodeToBeDeleted.leftChild;
            } else if(isLeftChild){
                parent.leftChild=nodeToBeDeleted.leftChild;
            } else {
                parent.rightChild = nodeToBeDeleted.leftChild;
            }
        }

        // if node has one child that is right child

        else if(nodeToBeDeleted.leftChild==null){
            if(nodeToBeDeleted==root){
                root=nodeToBeDeleted.rightChild;
            } else if(isLeftChild){
                parent.leftChild=nodeToBeDeleted.rightChild;
            } else {
                parent.rightChild = nodeToBeDeleted.rightChild;
            }
        }

        // if node has 2 children

        return true;
    }

}
