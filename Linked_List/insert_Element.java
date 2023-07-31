package Linked_List;
import java.util.Scanner;
public class insert_Element {

    public static Node<Integer> Insert(Node<Integer> head,int pos,int val){
        int count=1;

        Node<Integer> temp=head;
        if(pos==1){
            Node<Integer> newNode=new Node<Integer>(val);
            newNode.next=head;
            head=newNode;
            return head;
        }

        Node<Integer> newNode=new Node<Integer>(val);
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
        return head;

    }

    public static Node<Integer> Input(){
        Node<Integer> head=null;
        Node<Integer> tail=null;
        Scanner s=new Scanner(System.in);

        int data=s.nextInt();

        while(data!=-1){
            Node<Integer> newNode=new Node<>(data);

            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=s.nextInt();
        }
        s.close();
        
        return(head);
        

    }

    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args){
        Node<Integer> head=Input();
        Node<Integer> newHead=Insert(head,3,20);
        print(newHead);
    }
}

