package Linked_List;

public class checkLL_circular {
    
    public static String circular(Node<Integer> head){
        
        
        if(head==null){
            return("circular");
        }
        if(head.next==head){
            return("circular");
        }
        if(head.next==null){
            return("Non circular");
        }
        Node<Integer> temp=head.next;

        while(temp!=null && temp!=head){
            temp=temp.next;
        }
        if(temp==head){
            return("circular");
        }   
        return("Non circular");
    } 
}
