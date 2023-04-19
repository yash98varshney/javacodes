package Tree.Binary_Tree;

public class BTreeNode<T> {
    public T data;
    public BTreeNode<T> left;
    public BTreeNode<T> right;

    BTreeNode(T data){
        this.data=data;
        left=null;
        right=null;
    }
}


/*
public class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data){
        this.data=data;
        this.rigth=null;
        this.left=null;
    }

    public static Node<Integer> buildtree(Node<Integer> root){
        root=new Node(data);
        if(data==-1){
            return null;
        }

        root.left=buildtree(root.left);
        root.right=buildtree(root.right);
        return root;
    }
}



*/

/**
 * 
 */