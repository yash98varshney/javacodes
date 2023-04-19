package Questions.prefix_suffix_sum;

public class Kadane_algo {
    public static int maxsubarraysum(int n,int[] arr){
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;

        for(int i=0;i<n;i++){
            currsum=currsum+arr[i];
            if(currsum>maxsum){
                maxsum=currsum;
            }
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args){
        int[] arr={277314521};
        int ans=maxsubarraysum(1, arr);
        System.out.println(ans);
    }
}

/*
run loop and find max sum until current sum get -ve if current sum get -ve set it 0 and we get 
maximum sum which we can yeild from that subarray so make current sum 0 and again start the process
*/