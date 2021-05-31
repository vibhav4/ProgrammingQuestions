package ds.stack;

public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size){
        this.maxSize=size;
        this.stackArray=new char[maxSize];
        this.top=-1;
    }

    public void push(char j){
        try {
            top++;
            stackArray[top] = j;
        } catch(Exception e){
            top--;
            System.out.println(e);
        }
        System.out.println("Execution is here");
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is already at ");
            return '0';
        } else {
            int old_top=top;
            top--;
            return stackArray[old_top];
        }
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isFull(){
        return (maxSize-1==top);
    }

    public boolean isEmpty(){
        return (top==-1);
    }
}
