package AmazonSDE.Matrix;
import java.util.*;
public class Spiral_printing {
    
    public static ArrayList<Integer> spiral(int[][] arr,int r,int c){
        int top=0;
        int bottom=r-1;
        int left=0;
        int right=c-1;
        ArrayList<Integer> ans=new ArrayList<>();

        while(top<=bottom && left<=bottom){

            for(int i=left;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
