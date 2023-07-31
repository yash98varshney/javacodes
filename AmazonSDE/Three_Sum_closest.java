package AmazonSDE;
import java.util.*;
public class Three_Sum_closest {
    static int threeSumClosest(int[] array, int target)  
	{ 
        // code here
        int n=array.length;
        long sum=0;
        Arrays.sort(array);
        long closesum=Integer.MAX_VALUE;
        
        for(int i=0;i<n-2;i++){
            int s=i+1;
            int e=n-1;
            
            while(s<e){
                sum=array[i]+array[s]+array[e];
                if(Math.abs(target-sum)<Math.abs(target-closesum)){
                    closesum=sum;
                }
                if(Math.abs(target-sum)==Math.abs(target-closesum)){
                    closesum=Math.max(closesum,sum);
                }
                if(target>sum){
                    s++;
                }
                else{
                    e--;
                }
            }
        }
        return (int)closesum;
	} 
}
