//we have to add 5 functions 
//1. push 2. pop 3. isEmpty() 4. top() 5. size()
package Stack;
import java.util.*;
public class StackusingArraylist {
    //2 ways to store linked list and array 
    private ArrayList<Integer> data;
    private int top;

    public StackusingArraylist(){
        data=new ArrayList<Integer>();
        top=-1;
    }

    // public StackusingArraylist(int capacity){
    //     data=new int[capacity];
    //     top=-1;
    // }

    //Is Empty
    
    public boolean isEmpty(){
        if(top==-1){
            return(true);
        }
        else{
            return(false);
        }
    }

    //Size

    public int size1(){
        return(data.size());
    }

    //top

    public int top() throws StackEmptyException{
        if(size1()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        else{
            return (data.get(top));
        }
    }

    //push 

    public void push(int ele){
        data.add(ele);
        top++;
    }

    //pop

    public int pop() throws StackEmptyException{
        if(size1()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        int temp=data.get(top);
        data.remove(top);
        top--;
        return temp;
    }





}