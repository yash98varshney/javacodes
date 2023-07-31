package Questions.two_pointer;

import java.util.ArrayList;
import java.util.Arrays;
public class merge_intervals {
    
    // brute force approach 

    public static void mergeinterval(int[][] arr){
        Arrays.sort(arr,(a,b) ->Integer.compare(a[0], b[0]));
        ArrayList<int[]> newarr=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){        
            for(int j=i+1;j<n;j++){
                if(arr[i][1]>=arr[j][0]){
                    arr[i][1]=Math.max(arr[i][1],arr[j][1]);
                }
                else{
                    break;
                }
                arr[j][0]=0;
                arr[j][1]=0;
            }
            if(arr[i][1]!=0)
                newarr.add(arr[i]);
        }
        for(int[] ele :newarr){
            for(int e : ele){
                System.out.print(e +" ");
                
            }
            System.out.println();
        }
    }

        // best approach nlogn

        public static int[][] merge(int[][] arr){
            int n=arr.length;
            ArrayList<int[]> result=new ArrayList<>();
            if(n==0 || arr ==null ){
                return(result.toArray(new int[0][]));
            }

            Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));

            int start=arr[0][0];
            int end=arr[0][1];

            for(int[] i:arr){
                if(i[0]<=end){
                    end=Math.max(end,i[1]);

                }
                else{
                    result.add(new int[]{start,end});
                    start=i[0];
                    end=i[1];
                }
            }
            result.add(new int[]{start,end});
            return(result.toArray(new int[0][]));
        }
       

    

    public static void main(String[] args){
        int[][] arr={{1,2},{2,4},{6,10},{9,10},{10,200}};
        mergeinterval(arr);

    }
}


//  https://www.youtube.com/watch?v=2JzRBPFYbKE