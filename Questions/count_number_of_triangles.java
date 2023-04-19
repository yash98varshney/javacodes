package Questions;

//GFG problem :- 

public class count_number_of_triangles {
    public static int count(int[] arr,int n){
        int count=0;
        for(int i=n-1;i>=0;i--){
            int r=i-1;
            int l=0;

            while(l<r){
                if(arr[r]+arr[l]>arr[i]){
                    count+=(r-l);
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return(count);
    }  
}
