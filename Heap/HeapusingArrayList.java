package Heap;
import java.util.*;
//add()
//isEmpty
//size()
//swap
//upheapify()
//remove()
//downheapify()



public class HeapusingArrayList<T> {
    
    private ArrayList<Integer> arr=new ArrayList<>();

    public int size1(){
        return(arr.size());
    }

    public boolean isEmpty(){
        return(arr.size()==0);
    }

    private void swap(int pi , int ci){
        int child=arr.get(ci);
        int parent=arr.get(pi);
        arr.set(pi,child);
        arr.set(ci,parent);
    }

    private void upheapify(int ci){
        int pi=(ci-1)/2;
        if(arr.get(ci)<arr.get(pi)){
            swap(pi, ci);
            upheapify(pi);
        }
    }

    public void add(int ele){
        arr.add(ele);
        upheapify(arr.size()-1);
    }

    public int remove(){
        swap(0,arr.size()-1);
        int ans=arr.remove(arr.size()-1);
        downheapify(0);
        return(ans);
    }

    private void downheapify(int pi){
        int leftchild=(2*pi)+1;
        int right=(2*pi)+2;

        int minIndex=pi;

        if(leftchild < arr.size() && arr.get(leftchild)<arr.get(minIndex)){
            minIndex=leftchild;
        }
        if(right < arr.size() && arr.get(right)<arr.get(minIndex)){
            minIndex=right;
        }
        if(minIndex!=pi){
            swap(minIndex,pi);
            downheapify(minIndex);
        }
    }

}
