package Queue;

public class QueueUsingLL<T>{
    private Node<T> front;
    private Node<T> rear;
    private int size;
    
    public QueueUsingLL(){
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return(size);
    }

    public boolean isEmpty(){
        if(size==0){
            return(true);
        }
        return(false);
    }

    public T front(){
        return(front.data);
    }

    public void enqueue(T ele){
        Node<T> newNode = new Node<>(ele);
        if (rear==null){
            front=newNode;
            rear=newNode.next;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }

    public T dequeue() throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        T temp=front.data;
        front=front.next;
        if(size==1){
            rear=null;
        }
        size--;
        return(temp);
    }
}
