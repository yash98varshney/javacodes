package Heap.Method2;

public class Element<T> {
    int priority;
    T data;

    public Element(T data, int priority){
        this.data=data;
        this.priority=priority;
    }
}
