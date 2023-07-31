package Questions;

public class Move_all_negative {
    
    public static int[] move(int[] arr){
        int i=0;
        int j=0;
        int n=arr.length-1;
        while(j<=n){
            if(arr[j]<0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public static void main(String[] args){
       int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
       int[] ans=move(arr);
       for(Integer x:ans){
           System.out.println(x);
       }
    }
}
