package Tree;

public class print_nodes_at_K {

    public static void printAtK(TreeNode<Integer> root,int k){
        if(k<0){
            return;
        }
        //base case as we are using k now so K can be 0 while we minus it 
        if(k==0){
            System.out.println(root.data);
        }
        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i), k-1);
        }
    }

    
    
}
