import java.util.*;

public class Testing {
    
    static ArrayList<Integer> retainingRepetitions(int arr[] , int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> mapOccur =new HashMap<>();
        HashMap<Integer,Boolean> mapBool =new HashMap<>();
       
        int maxOccur=1;

        for(int i=0;i<arr.length;i++){
            if(mapOccur.containsKey(arr[i])){
                mapOccur.put(arr[i],mapOccur.get(arr[i])+1);
            }
            else{
                mapOccur.put(arr[i],1);
            }
        }

        int j=0;
        while(j<arr.length){

            int occur=mapOccur.get(arr[j]);
            
            System.out.println(arr[j]);
            System.out.println(occur);

            if(!mapBool.containsKey(maxOccur)){
                if(occur > maxOccur && maxOccur <=k){
                    for(int i=0;i<maxOccur;i++){
                        ans.add(arr[j]);
                    }
                    j=j+occur;
                    System.out.println(j);
                    mapBool.put(maxOccur,true);
                    maxOccur+=1;
                }
                else if(occur > maxOccur && maxOccur >k){
                    for(int i=0;i<k;i++){
                        ans.add(arr[j]);
                    }
                    j=j+occur;
                    System.out.println(j);
                    //maxOccur=k;
                }
                else {
                    for(int i=0;i<occur;i++){
                        ans.add(arr[j]);
                    }
                    System.out.println(j);
                    j=j+occur;
                }

            }
            else{
                for(int i=0;i<occur;i++){
                    ans.add(arr[j]);
                }
                System.out.println(j);
                j=j+occur;
            }
            
        }
        return ans;

    }

    public static void main(String[] args){
        int[] arr={1 ,2 ,3 ,3 ,4 };
        ArrayList<Integer> ans=retainingRepetitions(arr,3);
        System.out.println(ans);
    }

}
