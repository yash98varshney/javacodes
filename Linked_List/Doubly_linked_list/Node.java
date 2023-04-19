package Linked_List.Doubly_linked_list;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data){
        this.data=data;
        next=null;
        prev=null;
    }

}
