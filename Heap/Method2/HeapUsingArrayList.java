package Heap.Method2;
import java.util.*;

public class HeapUsingArrayList<T> {
    private ArrayList<Element<T>> heap;

    public HeapUsingArrayList(){
        heap=new ArrayList<>();
    }

    public void insert(T data, int priority){
        Element<T> e=new Element<>(data, priority);
        heap.add(e);

        int childIndex=heap.size()-1;;
        int parentIndex=(childIndex-1)/2;

        while(childIndex>0){
            if(heap.get(childIndex).priority < heap.get(parentIndex).priority){
                Element<T> temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
            else{
                return;
            }
        }
        
    }

    public T getMin() throws EmptyHeapException{
        if(heap.size()==0){
            throw new EmptyHeapException();
        }
        else{
            return(heap.get(0).data);
        }
    }

    public T removeMin() throws EmptyHeapException{
        if(heap.size()==0){
            throw new EmptyHeapException();
        }

        Element<T> removed= heap.get(0);
        T ans =removed.data;

        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex=0;
        int leftchildIndex=2*parentIndex+1;
        int rightchildIndex=2*parentIndex+2;

        while(leftchildIndex < heap.size()){
            int minIndex=parentIndex;
            if(heap.get(leftchildIndex).priority < heap.get(minIndex).priority){
                minIndex=leftchildIndex;
            }
            if(rightchildIndex <heap.size() && heap.get(rightchildIndex).priority < heap.get(minIndex).priority){
                minIndex=rightchildIndex;
            }
            if(minIndex==parentIndex){
                break;
            }

            Element<T> temp=heap.get(minIndex);
            heap.set(minIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);
            parentIndex=minIndex;
            leftchildIndex=2*parentIndex+1;
            rightchildIndex=2*parentIndex+2;
        }
        return ans;


    }

    public int size(){
        return(heap.size());
    }

    public boolean isEmpty(){
        return(heap.size()==0);
    }

}
