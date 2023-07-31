package Linked_List;

public class Move_0_1_2 {
    
    //Method 1

    public static Node<Integer> Move1(Node<Integer> head){
        int OneCount=0;
        int TwoCount=0;
        int zeroCount=0;

        Node<Integer> temp=head;

        while(temp!=null){
            if(temp.data==0){
                zeroCount++;
                temp=temp.next;
            }

            else if(temp.data==1){
                OneCount++;
                temp=temp.next;
            }

            else if(temp.data==2){
                TwoCount++;
                temp=temp.next;
            }
        }

        temp=head;

        while(temp!=null){

            if(zeroCount!=0){
                temp.data=0;
                temp=temp.next;
            }
            else if(OneCount !=0){
                temp.data=1;
                temp=temp.next;
            }
            else if(TwoCount !=0){
                temp.data=2;
                temp=temp.next;
            }
        }
        return head;

    }

    //Method 2:- 

    private static void insertinLL(Node<Integer> tail,Node<Integer> curr){
        tail.next=curr;
        tail=curr;
    }

    public static Node<Integer> Move2(Node<Integer> head){
        Node<Integer> zerohead=new Node<>(-1);
        Node<Integer> zerotail=zerohead;
        Node<Integer> onehead=new Node<>(-1);
        Node<Integer> onetail=onehead;
        Node<Integer> twohead=new Node<>(-1);
        Node<Integer> twotail=twohead;

        Node<Integer> temp=head;
        while(temp!=null){
            int val=temp.data;
            if(val==0){
                insertinLL(zerotail,temp);
            }
            else if(val==1){
                insertinLL(onetail,temp);
            }
            else if(val==2){
                insertinLL(twotail,temp);
            }
            temp=temp.next;
        }

        // merger all 3 LL 

        if(onehead.next!=null){
            zerotail.next=onehead.next;
        }
        else{
            zerotail.next=twohead.next;
        }

        onetail.next=twohead.next;
        twotail.next=null;

        head=zerohead.next;
        return head;


        
    }
}
