package Linked_List;

import java.util.ArrayList;

public class split_circular_LL_in_2_parts {
    
    public static ArrayList<Node<Integer>> split(Node<Integer> head){
        Node<Integer> slow=head;
        Node<Integer> fast=head.next;

        while(fast!=head){
            fast=fast.next;
            if(fast.next!=head){
                fast=fast.next;
            }
            slow=slow.next;
        }

        Node<Integer> head2=slow.next;
        slow.next=head;
        fast.next=head2;
        ArrayList<Node<Integer>> arr=new ArrayList<>();
        arr.add(head);
        arr.add(head2);
        return arr;

    }
}
