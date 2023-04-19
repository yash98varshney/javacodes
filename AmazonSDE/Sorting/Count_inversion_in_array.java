package AmazonSDE.Sorting;

// inversion is find when we merge 2 sorted array and left array element is grater than right sorted array all see video for clearification  


public class Count_inversion_in_array {
    static int count=0;
    
    public int[] mergesort(int[] arr,int si,int ei){
        if(si==ei){
            int[] tmp=new int[1];
            tmp[0]=arr[si];
            return tmp;
        }
        int mid=si+ei/2;

        int[] left=mergesort(arr, si, mid);
        int[] right=mergesort(arr, mid+1, ei);
        int[] ans=mergersortedArray(left,right);

        return ans;
    }

    public int[] mergersortedArray(int[] left,int[] right){

        int i=0;
        int j=0;
        int k=0;
        

        int[] ans=new int[left.length+right.length];
        while(i < left.length && j<right.length ){

            if(left[i]<=right[j]){
                i++;
                ans[k]=left[i];
                k++;
            }
            else{

                count+=(left.length-i);
                ans[k]=right[j];
                k++;
                j++;
            }
        }

        while(j<right.length){
            ans[k]=right[j];
            k++;
            j++;
        }

        while(i<left.length){
            ans[k]=left[i];
            k++;
            i++;
        }

        return ans;
    }
}
