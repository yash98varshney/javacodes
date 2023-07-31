package Linked_List;

import java.util.HashMap;

public class check_loop_LL {
    
    //Method 1:- 

    public static boolean loopcheck(Node<Integer> head){

        if(head==null){
            return false;
        }
        HashMap<Node<Integer>,Boolean> map=new HashMap<>();
        Node<Integer> temp=head;
        
        while(temp!=null){
            if(map.get(temp)==true){
                return true;
            }
            else{
                map.put(temp,true);
            }
            temp=temp.next;
        }
        return false;
    }


    //Method 2:- 
    //Floyds cycle detection Algo :- 

    public static Node<Integer> floydsloop(Node<Integer> head){
        if(head==null){
            return null;
        }

        Node<Integer> slow=head;
        Node<Integer> fast=head;

        while(fast!=null && slow!=null){
            
            fast=fast.next;
            
            if(fast!=null){
                fast=fast.next;
            }

            if(fast==slow){
                return slow;
            }
            
            slow=slow.next;
        }
        return null;

    }

    //Get Starting Node of cycle:- 


    public static Node<Integer> getStartingNode(Node<Integer> head){
        if(head==null){
            return null;
        }

        Node<Integer> intersection=floydsloop(head);
        Node<Integer> slow=head;

        while(slow!=intersection){
            slow=slow.next;
            intersection=intersection.next;

        }
        return slow;
    }

    //Remoe loop from LL :- 


    public static void removeLoop(Node<Integer> head){

        Node<Integer> startingloop=getStartingNode(head);
        Node<Integer> temp=startingloop;
        while(temp.next !=startingloop){
            temp=temp.next;
        }
        temp.next=null;
    } 
}



//https://www.youtube.com/watch?v=VxOFflTXlXo&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=53