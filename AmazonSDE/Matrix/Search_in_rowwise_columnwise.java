package AmazonSDE.Matrix;

// All rows are sorted and all column are sorted need to find the number 
//complexity O(n X m)

public class Search_in_rowwise_columnwise {
    
    //return boolean 
    public boolean findnum(int[][] arr,int k){

        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0){

            if(arr[r][c]==k){
                return true;
            }
            else if(arr[r][c]<k){
                r++;
            }
            else{
                c--;
            }
        }
        return false;
    }
}
