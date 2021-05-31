package ds.queue;

public class queue {

    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nitems;

    public queue(int size) {
        this.maxSize=size;
        this.queueArray=new long[size];
        this.front=0;
        this.rear=-1;
        this.nitems=0;
    }

    public void insert(long j){
        if(rear==maxSize-1){
            rear=-1;
        }
        rear++;
        queueArray[rear]=j;
        nitems++;
    }

    public long remove(){
        long temp = queueArray[front];
        front++;
        if(front==maxSize){
            front=0;
        }
        nitems--;
        return temp;
    }

    public long peakfront(){
        return queueArray[front];
    }

    public boolean isFull(){
        return (nitems==maxSize);
    }

    public boolean isEmpty(){
        return (nitems==0);
    }

    public void view(){
        for(int i=0;i<queueArray.length;i++){
            System.out.println(queueArray[i]);
        }
    }

}
