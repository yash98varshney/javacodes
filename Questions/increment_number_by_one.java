package Questions;

public class increment_number_by_one {
    
    public static int[] add_one(int[] arr,int n){
        int i=n-1;

        while(i>=0){
            if(arr[i]!=9){
                arr[i]=arr[i]+1;
                return arr;
            }
            arr[i]=0;
            i--;
        }

        int[] ans=new int[n+1];

        for(int j=0;j<n+1;j++){
            if(j==0){
                ans[j]=1;
            }
            else{
                ans[j]=0;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr={9,9,9};
        int[] ans=add_one(arr, 3);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
