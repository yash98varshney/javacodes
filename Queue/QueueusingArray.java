package Queue;

public class QueueusingArray {
    private int front;
    private int rear;
    private int[] data;
    private int size;
    
    public QueueusingArray(){
        data=new int[10];
        front=-1;
        size=0;
        rear=-1;
    }

    public QueueusingArray(int len){
        data=new int[len];
        front=-1;
        size=0;
        rear=-1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(size==0){
            return(true);
        }
        else{
            return(false);
        }
    }

    public void enqueue(int ele) throws QueueFullException{
        if(size==data.length){
            throw new QueueFullException();
        }
         
        if(size==0){
            front=0;
        }
        size++;
        rear=(rear+1)%data.length;;
        data[rear]=ele;

    }

    public int dequeue() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
        front=(front+1)%data.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }
}
