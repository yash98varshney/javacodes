package Questions.two_pointer;

public class finding_uniqueue_at_max_two {
    
    /*
    Maintaining a 2 pointers index=1 and count=1 starting and
    check if i-1 element == i 
    if yes increment count++ 
    else count =1;
    if count <=2 ;
    copy at index and increment index
    return index .
    */

    public static int uniqiue(int n ,int[] arr){
        int index =1;
        int count=1;

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if(count<=2){
                arr[index]=arr[i];
                index++;
            }
        }
        return(index);
    }
}
