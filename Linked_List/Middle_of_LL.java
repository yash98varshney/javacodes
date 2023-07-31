package Linked_List;

public class Middle_of_LL {
    
    public static Node<Integer> middle(Node<Integer> head){
        Node<Integer> s=head;
        Node<Integer> f=head.next;
       

        if(head==null || head.next==null){
            return head; 
        }
        
        if(head.next.next==null){
            return head.next;
        }
        while(f!=null){
            f=f.next;
            if(f !=null){
                f=f.next;
            }
            s=s.next;

        }
        return s;
    }
}
