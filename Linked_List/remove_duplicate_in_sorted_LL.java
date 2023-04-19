package Linked_List;

public class remove_duplicate_in_sorted_LL {
    
    public static Node<Integer> removeduplicate(Node<Integer> head){
        if(head==null){
            return null;
        }

        Node<Integer> curr=head;
        

        while(curr!=null){
            if(curr.next!=null && curr.data ==curr.next.data){
                Node<Integer> next=curr.next.next;
                curr.next.next=null;
                curr.next=next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    } 
}
