package Linked_List;

public class printingLL {
    
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args){
        Node<Integer> node1=new Node<Integer>(1);
        Node<Integer> node2=new Node<Integer>(12);
        node1.next=node2;
        node2.next=null;
        Node<Integer> head=node1;
        print(head);
    }
}
