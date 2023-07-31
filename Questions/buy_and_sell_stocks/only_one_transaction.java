package Questions.buy_and_sell_stocks;
// you can only buy one time 

public class only_one_transaction {
    
    // brute force 
    public static int stock1(int[] arr){
        int max=0;
        int diff=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    diff=arr[i]-arr[j];
                }
                else{
                    diff=arr[j]-arr[i];
                }
                
                if(diff>max){
                    max=diff;
                }

            }
        }
        return max;
    }

    // using auxilary space

    public static int stock2(int[] arr){
        int[] nar=new int[arr.length];
        int maxtillnow=arr[arr.length-1];
        nar[arr.length-1]=maxtillnow;
        for(int i=arr.length-2;i>-1;i--){
            if(arr[i]>=maxtillnow){
                nar[i]=arr[i];
                maxtillnow=arr[i];
            }
            else{
                nar[i]=maxtillnow;
            }
        }

        int profit=0;
        int maxprofit=0;
        for(int j=0;j<arr.length;j++){
            profit=nar[j]-arr[j];
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;

    }

    //using minlow till now 

    public static int stock3(int[] arr){
        int mintillnow=arr[0];
        int maxprofit=0;

        for(int i=0;i<arr.length;i++){
            if(mintillnow>arr[i]){
                mintillnow=arr[i];
            }
            int diff=arr[i]-mintillnow;
            if(maxprofit<diff){
                maxprofit=diff;
            }

        }
        return maxprofit;
    }

    public static void main(String[] args){
        int[] arr={3,5,1,7,4,9,3};
        int ans=stock2(arr);
        System.out.println(ans);

    }
}
