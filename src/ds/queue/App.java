package ds.queue;

public class App {

    public static void main(String args []) {
        queue qnew = new queue(3);
        qnew.insert(234);
        qnew.insert(23234);
        qnew.insert(234324);
        qnew.insert(1);

        qnew.view();
    }
}
