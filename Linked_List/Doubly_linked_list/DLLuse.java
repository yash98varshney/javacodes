package Linked_List.Doubly_linked_list;

public class DLLuse {
    
    //Print linked list
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    // Give size of LL 

    public static int length(Node<Integer> head){
        int count=0;
        Node<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return(count);
    }

    //Insert element int LL 
    
    public static Node<Integer> insert(Node<Integer> head , int pos,int val){
        Node<Integer> temp=head;
        int count=1;
        if(pos==1){
            Node<Integer> newNode=new Node<>(val);
            newNode.next=temp;
            temp.prev=newNode;
            head=newNode;
            return head;
        }
        Node<Integer> newNode=new Node<>(val);
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        temp.next.prev=newNode;
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.prev=temp;
        return head;
        
    }
    public static void main(String[] args){
        Node<Integer> node1=new Node<>(10);
        Node<Integer> node2=new Node<>(20);
        Node<Integer> node3=new Node<>(40);
        node1.prev=null;
        node1.next=node2;
        node2.prev=node1;
        node2.next=node3;
        node3.prev=node2;
        node3.next=null;
        Node<Integer> head=node1;
        print(head);
        int len=length(head);
        System.out.println(len);
        head=insert(head, 3, 30);
        print(head);

    }
}
