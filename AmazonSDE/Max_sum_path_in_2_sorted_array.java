package AmazonSDE;

public class Max_sum_path_in_2_sorted_array {

    public  int  maxPathSum(int ar1[], int ar2[]){
        int i=0;
        int j=0;
        int n=ar1.length;
        int m=ar2.length;
        int s1=0;
        int s2=0;
        int Fsum=0;
        
        while(i<n && j<m){
            if(ar1[i] < ar2[j]){
                s1=s1+ar1[i];
                i++;
            }
            else if(ar1[i]>ar2[j]){
                s2=s2+ar2[j];
                j++;
            }
            else if(ar1[i]==ar2[j]){
                int maximum=Math.max(s1,s2);
                Fsum=Fsum+maximum+ar1[i];
                s1=0;
                s2=0;
                i++;
                j++;
            }
            
        }
        while(i<n){
            s1=s1+ar1[i];
            i++;
        }
        while(j<m){
            s2=s2+ar2[j];
            j++;
        }
        int max=Math.max(s1,s2);
        Fsum=Fsum+max;
        return Fsum;
    }
}

/*
M = 5, N = 4
A[] = {2,3,7,10,12}
B[] = {1,5,7,8}
Output: 35
*/