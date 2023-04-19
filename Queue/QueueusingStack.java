package Queue;
import java.util.*;
public class QueueusingStack<T>{
    private Stack<T> stack1=new Stack<>();
    private Stack<T> stack2=new Stack<>();

    public int size(){
        return(stack1.size());
    }

    public boolean isEmpty(){
        if(stack1.size()==0){
            return(true);
        }
        else{
            return(false);
        }
    }

    public void enqueue(T ele){
        stack1.push(ele);
    }

    public T dequeue(){
        while(!isEmpty()){
            T temp=stack1.pop();
            stack2.push(temp);
        }
        T result =stack2.pop();
        while(!isEmpty()){
            stack1.push(stack2.pop());
        }
        return(result);
    }

    public T front(){
        while(!isEmpty()){
            stack2.push(stack1.pop());
        }
        T result=stack2.peek();
        return(result);
    }
}
