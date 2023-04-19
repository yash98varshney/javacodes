package Questions.buy_and_sell_stocks;

public class buy_and_sell_as_many_times {
    
    public static int profit(int[] arr){
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=(arr[i]-arr[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int ans=profit(arr);
        System.out.print(ans);
    }
}

//https://www.youtube.com/watch?v=Q7v239y-Tik&list=RDCMUC58_wzhvJta3hDSPvRLDAqg&start_radio=1&rv=Q7v239y-Tik&t=353