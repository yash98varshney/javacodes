package Linked_List;
import java.util.Scanner;
public class reverseLL {

    // Iterative way 
    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> prev=null;
        Node<Integer> cur=head;
        Node<Integer> temp;

        while(cur!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return(prev);
    }

    //recursive way

    public static Node<Integer> rev(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> newHead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return(newHead);

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
        head=rev(head);
        print(head);
    }



    
}
