package Linked_List;

public class merge_two_sorted_LL {

    public static Node<Integer> mergesorted(Node<Integer> head1,Node<Integer> head2){
        if(head1.next==null){
            head1.next=head2;
            return head1;
        }

        Node<Integer> curr1=head1;
        Node<Integer> next1=curr1.next;
        Node<Integer> curr2=head2;
        Node<Integer> next2=curr2.next;

        while(next1!=null && curr2!=null){
            
             
            if(curr2.data<=next1.data && curr2.data >=curr1.data){
                // adding node between
                curr1.next=curr2;
                next2=curr2.next;
                curr2.next=next1;

                //pointer ko aage 
                curr1=curr2;
                curr2=next2;
            }
            else{
                curr1=next1;
                next1=next1.next;

                if(next1==null){
                    curr1.next=curr2;
                    return head1;
                }
            }
            
        }
        return head1;


    }
    
    public static Node<Integer> merger(Node<Integer> head1,Node<Integer> head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }

        if(head1.data<=head2.data){
            return mergesorted(head1,head2);
        }
        else{
            return mergesorted(head2,head1);
        }
    }
}
