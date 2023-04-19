package Tree;
import java.util.*;

public class input_using_queue {
    public static TreeNode<Integer> takeinput(){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter root node");
        int rootData=s.nextInt();
        
        Queue<TreeNode<Integer>> pending=new LinkedList<>();
        TreeNode<Integer> root=new TreeNode<Integer>(rootData);

        pending.add(root);

        while(!pending.isEmpty()){
            TreeNode<Integer> Frontnode=pending.poll();

            System.out.println("Enter num of children of"+ Frontnode.data);
            int numChildren=s.nextInt();
            
            for(int i=0;i<numChildren;i++){
                System.out.println("Enter the "+(i+1)+"th child of "+ Frontnode.data);
                int child=s.nextInt();
                TreeNode<Integer> childNode=new TreeNode<Integer>(child);
                Frontnode.children.add(childNode);
                pending.add(childNode);
            }
        }
        s.close();
        return root;
    }


    private static void print(TreeNode<Integer> root){
        String s=root.data+ ":";
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data +";";
        }
        System.out.println(s);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }

    }

    public static void main(String[] args){
        TreeNode<Integer> root=takeinput();
        print(root);
    }


}
