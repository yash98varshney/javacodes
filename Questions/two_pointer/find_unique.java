package Questions.two_pointer;

public class find_unique {
    
    /*
    
   //  brute force approach 


    making a hashset and assigning value to it 
    and pop values from it and copy to first n elements where n=size of hashset and returning hashset size;


    // Better approach 


    Maintaining a 2 pointers i=0 and j=1 starting and 
    check if element at i == element at j if yes than j++;
    else i ++ and than copy element at j to element at i ;
    and return i+1; 
    */

    public static int uniqueu(int n,int[] arr){
        int i=0;
        if(n==0){
            return(0);
        }

        for(int j=1;j<n;j++){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
            }
        }
        return(i+1);
    }
}
