package Linked_List;

public class insert_into_sorted_circular_LL {
    
    public static Node<Integer> insert(Node<Integer> head, int val){

        // case 1:- head==null

        if(head==null){
            Node<Integer> newNode=new Node<>(val);
            head=newNode;
            head.next=head;
            return head;
        }

        // case 2 :- 1 element in linked LL

        if(head.next==null){
            Node<Integer> newNode=new Node<>(val);
            head.next=newNode;
            head.next.next=head;
            return head;
        }

        // case 3:- 2 or more elements 
        /*
        3 cases are possible 
            a)insertval <= min node then create node after max node
            b) insertval>= maxnode then create node after max node .
            c) loop around and find where to insert with 2 pointers 
        */

        Node<Integer> minNode=head;
        Node<Integer> maxNode=head;
        Node<Integer> prev=head;
        Node<Integer> cur=head.next;

        while(cur!=head){
            if(prev.data>cur.data){
                minNode=cur;
                maxNode=prev;
                break;
            }
            if(cur.data<minNode.data){
                minNode=cur;
            }
            if(cur.data>=maxNode.data){
                maxNode=cur;
            }
            prev=cur;
            cur=cur.next;
        }
        if(val <=minNode.data || val>=maxNode.data){
            Node<Integer> newNode=new Node<>(val);
            maxNode.next=newNode;
            maxNode.next.next=minNode;
            return head;
        }
        maxNode.next=null;
        cur=minNode;
        prev=maxNode;
        while(cur!=null){
            if(val>=cur.data && val<=cur.data){
                prev.next=new Node<Integer>(val);
                prev.next.next=cur;
                maxNode.next=minNode;
                return head;
            }
            prev=cur;
            cur=cur.next;
        }
        return head;
    }
}
