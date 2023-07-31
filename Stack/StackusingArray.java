//we have to add 5 functions 
//1. push 2. pop 3. isEmpty() 4. top() 5. size()
package Stack;

public class StackusingArray {
    //2 ways to store linked list and array 
    private int[] data;
    private int top;

    public StackusingArray(){
        data=new int[10];
        top=-1;
    }

    public StackusingArray(int capacity){
        data=new int[capacity];
        top=-1;
    }

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

    public int size(){
        if(top==-1){
            return(0);
        }
        else{
            return(top+1);
        }
    }

    //top

    public int top() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        else{
            return (data[top]);
        }
    }

    //push 

    public void push(int ele) throws StackFullException{
        if(size()==data.length){
            StackFullException j=new StackFullException();
            throw j;
        }
        top++;
        data[top]=ele;
    }

    //pop

    public int pop() throws StackEmptyException{
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        int temp=data[top];
        top--;
        return temp;
    }





}