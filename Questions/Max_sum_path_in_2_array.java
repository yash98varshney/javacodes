package Questions;

public class Max_sum_path_in_2_array {
    
    public static int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int i=0;
        int j=0;
        int sum1=0;
        int sum2=0;
        int res=0;
        
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]>ar2[j]){
                sum2=sum2+ar2[j];
                j++;
            }
            else if(ar1[i]<ar2[j]){
                sum1=sum1+ar1[i];
                i++;
            }
            else{
                res=res+Math.max(sum1,sum2);
                sum1=0;
                sum2=0;
                
                while(ar1[i]==ar2[j] && i<ar1.length  && j< ar2.length){
                    res=res+ar1[i];
                    i++;
                    j++;
                }
            }
        }
        while(i<ar1.length){
            sum1=sum1+ar1[i];
            i++;
        }
        while(j<ar2.length){
            sum2=sum2+ar2[j];
            j++;
        }
        res=res+Math.max(sum1,sum2);
        
        return res;
    }
}

//https://www.youtube.com/watch?v=UiVAPIDxmB0

//https://practice.geeksforgeeks.org/problems/max-sum-path-in-two-arrays/1#