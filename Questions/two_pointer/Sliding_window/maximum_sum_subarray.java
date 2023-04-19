package Questions.two_pointer.Sliding_window;

public class maximum_sum_subarray {
    
    public static int[] maxsum(int[] arr,int n,int k){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int j=0;
        int i=0;
        int start=0;
        int end=0;
        int[] newarr= new int[2];

        while(j<n){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(maxsum<sum){
                    start=i;
                    end=j;
                    maxsum=sum;
                }
                sum=sum-arr[i];
                j++;
                i++;

            }
        }
        newarr[0]=start;
        newarr[1]=end;
        return(newarr);
    }

    public static void main(String[] args){
       int[] arr={2,5,1,8,2,9,1};
        int[] ans=maxsum(arr,7,3);

        for(Integer i:ans){
            System.out.println(i);
        }
        
    }
}

//https://www.youtube.com/watch?v=MW4lJ8Y0xXk&list=PL_z_8CaSLPWeM8BDJmIYDaoQ5zuwyxnfj&index=5