package AmazonSDE.Matrix;
import java.util.*;
public class Make_Matrix_Beautiful {
    
    static int findMinOperation(int matrix[][], int n)
    {
        // code here
        int max=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int rowsum=0;
            int colsum=0;
            
            for(int j=0;j<n;j++){
                rowsum+=matrix[i][j];
                colsum+=matrix[j][i];
            }
            max=Math.max(max,Math.max(rowsum,colsum));
        }
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=matrix[i][j];
            }
            arr.add(sum);
        }
        
        int op=0;
        for(Integer x: arr){
            op+=(max-x);
        }
        return op;
    }
}
