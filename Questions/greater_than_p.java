package Questions;
//[3,11,2,23,3,23,7]
public class greater_than_p {
    public static boolean greaterthanp(int[] arr){
        int i=0;
        int j=0;
        int n=arr.length;
        int count=0;
        if(arr.length==1){
            return(false);
        }

        while(j<n){

            if(arr[j]>arr[i] && i<n){
                count++;
                if(j==n-1){
                    if(count==arr[i]){
                        return(true);
                    }
                    i++;
                    j=0;
                    count=0;


                }
                j++;
            }
            else{
                if(j==n-1){
                    if(count==arr[i]){
                        return(true);
                    }
                    i++;
                    j=-1;
                    count=0;
                }
                j++;
            }
            if(i==n-1){
                break;
            }
            
        }
        return(false);
    }

    public static void main(String[] args){
        int[] arr={7,3,16,10,16};
        boolean ans=greaterthanp(arr);
        System.out.println(ans);
    }
}
