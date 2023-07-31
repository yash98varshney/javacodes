package Recursion;

//base case when size of array 0 or index reaches n
//recursion call (arr,size-1,num,output[]) this will give ans as output integer
//Small calculation:- 1.) update each element of output array as index of output array is one less than original array
//                    2.) check at index 0 if yes than shift output array and place index at front if no return ans 
//                    3.) return ans .
public class all_index_array {
    public static int[] allIndex(int[] input,int x,int startIndex){
        if(startIndex==input.length+1){
            int[] output=new int[0];
            return(output);
        }
        int[] smallOutput=allIndex(input, x, startIndex+1);
        if(input[startIndex]==x){
            int[] output=new int[smallOutput.length+1];
            output[0]=startIndex;
            for(int i=0;i<smallOutput.length;i++){
                output[i+1]=smallOutput[i];
            }
            return(output);
        }
        else{
            return(smallOutput);
        }
    }
}
