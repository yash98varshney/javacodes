package Linked_List;

public class check_palendrome {
    
    private static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> prev=null;
        Node<Integer> curr=head;
        Node<Integer> next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static boolean checkPalendrome(Node<Integer> head){
        Node<Integer> temp1=head;
        Node<Integer> slow=head;
        Node<Integer> fast=head.next;

        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
            }
            slow=slow.next;
        }

        Node<Integer> middle=slow;
        Node<Integer> temp2=middle.next;
        middle.next=reverse(temp2);

        Node<Integer> head2=middle.next;

        while(head2!=null){
            if(temp1.data!=head2.data){
                return false;
            }
            temp1=temp1.next;
            head2=head2.next;
        }
        temp2=middle.next;
        middle.next=reverse(temp2);

        return true; 

    }
}
