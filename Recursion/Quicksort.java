package Recursion;

// works on devide and conqueur approach  we can divide in 2 or more parts and solve it recurssively until reached to base case

//take first element as pivot element and find its position and swap it with the element present at that position
//All elements less than pivot element should be at left and grater than pivot element should be at right side . this is called partition of array
//Now array is devided and we have to call Quicksort recursively to get sorted array

//Suod code :- 

/* 
void quicksort(arr,si,ei){
    if(si>=ei){
        return;
    }

    partition(arr,si,ei)
    for part one 
    quicksort(arr,si,pivot -1)
    quicksort(arr,pivot+1,ei)

}

int  partition(arr,si,ei){
    1.) find pivot.
    2.) Place pivot at the position .
    3.) ensure towards left element < pivot and towards right element > pivot ans equal also go to left
    4.) return pivot posiiton index 

    How to make this function
    1.) check for all the numbers in the array number smaller than pivot and get it's count 
    2.)and leave that numeber of position from start and place pivot element 
    3.) Swap si and pivot position
    4.) take 2 varaibles i=si and j=ei and check if i<pivot than i++ and j>pivot j-- else if i>pivot hold and when we got number at j 
    which is smaller than pivot swap it with element at i.

    for all this use while loop 

    while(i<pivot and j>pivot ){
        do all this stuff.
    }

    and return pivot position.
}

*/
public class Quicksort {

    private static int partition(int[] arr,int si,int ei){
        int pivot=arr[si];
        int count=0;
        for(int i=si+1;i<ei;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }

        int position_of_pivot=si+count ;
        int temp=arr[position_of_pivot];
        arr[position_of_pivot]=pivot;
        arr[si]=temp;

        int i=si;
        int j=ei;

        while(i < position_of_pivot && j > position_of_pivot){
            if(arr[i]<=pivot){
                i++;
            }
            else if(arr[j]> pivot){
                j--;
            }
            else{
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
                i++;
                j--;
            }
        }
        return(position_of_pivot);
    }

    public static void quicksort(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }

        int pivot =partition(arr,si,ei);
        quicksort(arr,si,pivot+1);
        quicksort(arr,pivot+1,ei);
    }
    
}
