package AmazonSDE.Matrix;

public class Rotate_by_90 {
    
    // Naive solution with O(n^2) time and O(n^2) space 
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=arr[0].length;
        int[][] temp=new int[n][n];
        //int repN=n;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<n;i++){
                temp[n-(j+1)][i]=arr[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }

    }


    /*
    Inccase of ANTI clockwise rotation :- 
        take transpose 
        Reverse each column
        
    Incase of ClockWise rotation:- 
        take transpose 
        Reverse each row;
    */

    // For any Multiple of 90 just do the process that number of times :- means in case of 180 [transpose reverse] [transpose reverse] 
    //                                                                                     270 [transpose reverse] [transpose reverse] [transpose reverse] 
  
}
