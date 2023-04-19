package AmazonSDE;

public class Max_and_Second_max_in_duplicate_array {
    public static void main(String[] args){
        int[] arr={2,2,3,4,5,6,7,8,8,9,9,9};
        int max1=-1;
        int max2=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                int temp=max1;
                max1=arr[i];
                max2=temp;
            }
            else if(arr[i]!=max1 && arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.print(max1);
        System.out.println(max2);
    }
}


