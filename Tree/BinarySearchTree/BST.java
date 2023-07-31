package Tree.BinarySearchTree;

public class BST {
    
    public static void main(String[]args){
        Node root=new Node(11);
        root.left=new Node(10);
        root.right=new Node(30);
        root.left.left=new Node(9);
        root.right.right=new Node(40);
        helper(root, 8);
        pre(root);

    }

    public static void helper(Node root,int x){
    //    while(root!=null){
    //     if(root.data==x){
    //         System.out.println("value exist");
    //         break;
    //     }
    //     else  if(root.data<x){
    //         root=root.right;
    //     }
    //     else if(root.data>x){
    //         root=root.left;
    //     }
    //    }
        if(root.left==null && root.right==null){
            Node temp=new Node(x);
            if(root.data<x){
                root.right=temp;
            }
            else{
                root.left=temp;
            }
            return;
        }

        if(root.data<x){
            helper(root.right, x);   //root.right=helper(root.right, x);
        }
        else if(root.data>x){
            helper(root.left, x);   ////root.left=helper(root.left, x);
        }
       
    }

    public static void pre(Node root){
        if(root==null){
            return;
        }

        System.out.println(root.data);
        pre(root.left);
        pre(root.right);
    }


}

class Node{
    Node left;
    Node right;
    int data;

    Node(int data){
        this.data=data;
    }
}
