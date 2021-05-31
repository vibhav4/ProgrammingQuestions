package ds.binarysearchtree;

public class App {

    public static void main(String args[]){

        BST tree = new BST();
        tree.insert(10,"ten");
        tree.insert(20,"twenty");
        tree.insert(15,"fifteen");

        System.out.println("Maximun-" + tree.findMax().key);
        System.out.println("Minimun-" + tree.findMin().key);
    }
}
