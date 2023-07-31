package Tree.Binary_Tree;
import java.util.*;
public class take_input {

//Tree Input recursively 

    public static BTreeNode<Integer> input(Scanner s){
        int rootData;
        System.out.println("Enter the root data");
        rootData=s.nextInt();

        //base case
        if(rootData==-1){
            return null;
        }

        BTreeNode<Integer> root=new BTreeNode<Integer>(rootData);

        root.left=input(s);
        root.right=input(s);
        return root;
    }

// Print Tree function 

    public static void print(BTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String str=root.data+" ";
        if(root.left!=null){
            str=str+"L: "+root.left.data+";";
        }

        if(root.right!=null){
            str=str+"R: "+root.right.data+";";
        }
        System.out.println(str);
        print(root.left);
        print(root.right);
    }

// take input iteratively

public static BTreeNode<Integer> input2(){
    Scanner s=new Scanner(System.in);
    Queue<BTreeNode<Integer>> pending=new LinkedList<>();
    System.out.println("Enter the root node");
    int rootData=s.nextInt();
    if(rootData == -1){
        s.close();
        return null;
    }
    BTreeNode<Integer> root=new BTreeNode<Integer>(rootData);
    pending.add(root);
    BTreeNode<Integer> first;
    while(!pending.isEmpty()){
        first=pending.poll();

        System.out.println("Enter left child of "+ first.data);
        int left=s.nextInt();
        if(left!=-1){
            BTreeNode<Integer> child=new BTreeNode<Integer>(left);
            pending.add(child);
            first.left=child;
        }

        
        System.out.println("Enter right child of "+ first.data);
        int rigth=s.nextInt();
        if(left!=-1){
            BTreeNode<Integer> child=new BTreeNode<Integer>(rigth);
            pending.add(child);
            first.right=child;
        }
    }
    s.close();
        
    return(root);
    }


//Number of nodes in tree:- 
    public static int count(BTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int ans=1;
        ans+=count(root.left);
        ans=ans+count(root.right);
        return ans;
    }

//Diameter of Binary tree :- 

    public static Pair<Integer,Integer> HeightDia(BTreeNode<Integer> root){
        if(root==null){
            Pair<Integer,Integer> output=new Pair<>();
            output.first=0;
            output.second=0;
            return output;
        }
        Pair<Integer,Integer> lo=HeightDia(root.left);
        Pair<Integer,Integer> ro=HeightDia(root.right);

        
        int op1=lo.first+ro.first;
        int op2=lo.second;
        int op3=ro.second;

        int Diameter=Math.max(op1,Math.max(op2,op3));
        int height=1+Math.max(lo.first, ro.first);
        Pair<Integer,Integer> output=new Pair<>();
        output.first=height;
        output.second=Diameter;

        return output;

    }

//Inorder Trivarsal
    public static void Inorder(BTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+ " ");
        Inorder(root.right);
    }

//Preorder Trivarsal

    public static void Preorder(BTreeNode<Integer> root){
        if(root==null){
            return;
        }
        
        System.out.print(root.data+ " ");
        Preorder(root.left);
        Preorder(root.right);
    }


//Postorder Trivarsal

    public static void Postorder(BTreeNode<Integer> root){
        if(root==null){
            return;
        }
        
        
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+ " ");
    }

// LevelOrder Traversal

    public static void LevelOrder(BTreeNode<Integer> root){
        Queue<BTreeNode<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            BTreeNode<Integer> temp=queue.poll();
           
            if(temp==null){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
            else{
                System.out.println(temp.data);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
    
    
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }

           
        }
    }


    
    


    public static void main(String[] args){
        
        BTreeNode<Integer> root=input2();
        print(root);
        
    }
}
