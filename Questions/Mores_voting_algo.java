package Questions;

public class Mores_voting_algo {
    public static int maximum_element(int[] arr){
        int n=arr.length;
        int remaining_element=arr[0];
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==remaining_element){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                remaining_element=arr[i];
                count=1;
            }
        }
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==remaining_element){
                count2++;
            }
        }
        if(count2>n/2){
            return(remaining_element);
        }
        else{
            return(-1);
        }
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3};
        int ans=maximum_element(arr);
        System.out.println(ans);
    }
}

//Maximum element in an array occurence of number is more than n/2 times 
//https://www.youtube.com/watch?v=X0G5jEcvroo