package AmazonSDE.Sorting;

public class Quicksort {
    
    public static void quicksort(int[] arr,int si,int ei){
        
        if(si>=ei){
            return ;
        }

        int partition_index=partition(arr,si,ei);
        quicksort(arr, si, partition_index+1);
        quicksort(arr, partition_index+1, ei);
    }

    public static int partition(int[] arr,int si,int ei){

        int pivot=arr[0];
        int count=0;
        for(int i=0;i<ei;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }

        int partition_index=si+count;
        int temp=arr[si+count];
        arr[si+count]=pivot;
        arr[0]=temp;

        int i=si;
        int j=partition_index+1;
        while(i<partition_index && j>partition_index){
            if(arr[i]<arr[partition_index]){
                i++;
            }
            else if(arr[j]>arr[partition_index]){
                j--;
            }
            else{
                int te=arr[i];
                arr[i]=arr[j];
                arr[j]=te;
                i++;
                j--;
            }

        }

        return partition_index;

    }
}
