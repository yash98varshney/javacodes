package Sorting;

public class QuickSelect {
    
    public static int quickSlect(int[] arr,int lo,int hi,int k){

        int pivot=arr[hi];
        int pi=partition(arr,pivot,lo,hi);

        if(k<pi){
            return quickSlect(arr, lo,pi-1, k);
        }
        else if(k>pi){
            return quickSlect(arr, pi+1, hi, k);
        }
        else {
            return arr[pi];
        }
    }

    public static int partition(int[] arr,int pivot,int lo,int hi){
        int i=lo;
        int j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                i++;
            }
            
        }
        return(j-i);
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
}
