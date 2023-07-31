package Linked_List;
import java.util.Scanner;
public class DeleteNode {
    
    public static Node<Integer> Delete(Node<Integer> head,int pos){
        int count=1;
        if(pos==1){
            head=head.next;
            return(head);
        }
        Node<Integer> temp=head;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return(head);
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
        head=Delete(head, 4);
        print(head);
    }

}
