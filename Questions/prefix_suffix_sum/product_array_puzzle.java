package Questions.prefix_suffix_sum;

public class product_array_puzzle {

    //brute force 
    public static int[] productarray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int product=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]!=arr[j]){
                    product=product*arr[j];
                }
            }
            ans[i]=product;
            product=1;
        }
        return ans;
    }

    // Using division operator :- 

    public static int[] prodarray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            prod=prod*arr[i];
        }
        
        for(int i=0;i<n;i++){
            int num=prod;
            ans[i]=num/arr[i];

        }
        return(ans);

    }

    // Without division and using prefix and suffix product array 

    public static int[] product_arr(int[] arr){
        int[] ans=new int[arr.length];
        int n=arr.length;

        int[] prefix_product=new int[n];
        int[] suffix_product=new int[n];
        
        prefix_product[0]=1;
        suffix_product[n-1]=1;

        for(int i=1;i<n;i++){
            prefix_product[i]=arr[i-1]*prefix_product[i-1];
        }
        
        for(int i=n-2;i>=0;i--){
            suffix_product[i]=arr[i+1]*suffix_product[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]=prefix_product[i]*suffix_product[i];
        }
        return(ans);
    }

    public static void main(String[] args){
        int[] arr={10,3,5,6,2};
        int[] ans=product_arr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
