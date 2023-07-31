// find the minimum +ve number which is missing in the array in O(1) time and O(1) space 
package Questions;
import java.util.*;

public class first_smallest_missing {

    // brute force approach:- 

    public static int find(int[] arr){
        
        //int ans=0;
        for(int i=1;i<arr.length+2;i++){
            boolean check=false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>0){
                    if(i==arr[j]){
                        check=true;
                        break;
                    }
                }

            }

            if(check==false){
                return(i);
            }
        }
        return(arr.length);
    }

    //nlogn approach :- 

    public static int find1(int[] arr){
        Arrays.sort(arr); //this will take nlogn time .
        int count=0;
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            count=count+1;
            if(arr[i]==1){
                check=true;
                count=1;
                continue;
            }
            if(check==true){
                if(arr[i]==count){
                    continue;
                }
                else{
                    
                    return(count);
                }
            }
            else if(arr[i]<=0){
                continue;    
            }
            else{
                return(1);
            }
        }
        if(arr[arr.length-1]==arr.length-1){
            return(arr.length);
        }
        else{
            return(arr.length+1);
        }
        

    }

    public static void main(String[] args){
        int[] arr={-1,1};  // 1,2,3,4
        int ans=find1(arr);
        System.out.println(ans);
    }
}
