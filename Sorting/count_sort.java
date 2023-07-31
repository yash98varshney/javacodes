package Sorting;

public class count_sort {
    public static int[] sort(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        int size=max-min+1;
        int[] newarr=new int[size];

        // frequency array 

        for(int i=0;i<arr.length;i++){
            int ad=arr[i]-min;
            if(newarr[ad]==0){
                newarr[ad]=1;
            }
            else{
                newarr[ad]=newarr[ad]+1;
            }
        }

        // prefix sum array 
        int[] prefix_sum=new int[newarr.length];
        prefix_sum[0]=newarr[0];
        int sum=prefix_sum[0];
        for(int i=1;i<newarr.length;i++){
            sum=sum+newarr[i];
            prefix_sum[i]=sum;
        }

        int[] finalans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int num=arr[i]-min;
            int put=prefix_sum[num]-1;
            finalans[put]=arr[i];
            prefix_sum[num]=prefix_sum[num]-1;
        }


        return(finalans);

    }

    public static void main(String[] args){
        int[] arr={9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        int[] ans=sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

//https://www.youtube.com/watch?v=p-OyKUgIrx4