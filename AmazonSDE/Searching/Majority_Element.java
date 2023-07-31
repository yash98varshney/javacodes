package AmazonSDE.Searching;

public class Majority_Element {
    
    public static void main(String[] args){

        int A[] = {3,1,3,2}; 
        int n=A.length;
        // if(n==1){
        //     System.out.println(A[0]);
        // }
        int count=0;
        int currEle=A[0];
        for(int i=0;i<n;i++){
            if(A[i]==currEle){
                count++;
            }
            else{
                
                if(count !=0){
                    count--;
                    if(count==0){
                        currEle=A[i];
                        count=1;
                    }
                }
                else{
                    currEle=A[i];
                    count=1;
                }
            }
        }
        count=0;
        for(int i=0;i<n;i++){
            if(A[i]==currEle){
                count++;
            }
        }
        if(count>n/2){
            System.out.println(currEle);
        }
        else{
            System.out.println(-1);
        }
        
    }
}
