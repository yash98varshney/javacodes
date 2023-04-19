package AmazonSDE.Matrix;
import java.util.*;

public class Boolean_Matrix {
 
    void booleanMatrix(int matrix[][])
    {
        int r=matrix.length;
        int c=matrix[0].length;
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> col=new HashSet<>();
    
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    row.add(i);
                    col.add(j);
                }
            }
        } 
        
        for(Integer x:row){
            int[] rw=matrix[x];
            for(int i=0;i<rw.length;i++){
                rw[i]=1;
            }
        }
        
        for(Integer y:col){
            for(int i=0;i<r;i++){
                matrix[i][y]=1;
            }
        }
    }
}
