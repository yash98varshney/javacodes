package Questions;

public class third_largest_element {
    
    public static int thirdlargest(int[] arr,int n){
        if(arr.length<3){
            return -1;
        }
        int first=arr[0];
        int second=arr[1];
        int third=Integer.MIN_VALUE;

        for(int i=2;i<n;i++){
            if(third<arr[i]){
                third=arr[i];
            }
            if(second<third){
                int temp=second;
                second=third;
                third=temp;
            }
            if(first<second){
                int temp=first;
                first=second;
                second=temp;
            }

        }
        return third;
    }
}
