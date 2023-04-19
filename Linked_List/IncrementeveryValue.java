package Linked_List;
import java.util.Scanner;
public class IncrementeveryValue {
   
    public static void Increment(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data=temp.data+1;
            temp=temp.next;
        }
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
        Increment(head);
        print(head);
    }

}
