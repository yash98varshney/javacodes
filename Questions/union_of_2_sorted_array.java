package Questions;
import java.util.*;
public class union_of_2_sorted_array {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        int i=0;
        int j=0;
        //int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        
        while(j<m && i<n){
            if(arr1[i]<arr2[j]){
                if(i!=0 && arr1[i]!=arr1[i-1]){
                    if(ans.size()!=0 && ans.get(ans.size()-1)!=arr1[i]){
                         ans.add(arr1[i]);
                    }
                    else if(ans.size()==0){
                       ans.add(arr1[i]); 
                    }
                   
                    
                    i++;
                }
                else if(i==0){
                    ans.add(arr1[i]);
                    i++;
                }
               
                else{
                    i++;
                }
            }
            else if(arr1[i]==arr2[j]){
                if(ans.size()!=0 && ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                else if(ans.size()==0){
                    ans.add(arr1[i]);
                }
                
                i++;
                j++;
            }
            else{
                if(j!=0 && arr2[j]!=arr2[j-1]){
                    if(ans.size()!=0 && ans.get(ans.size()-1)!=arr2[j]){
                        ans.add(arr2[j]);
                    }
                    else if(ans.size()==0){
                        ans.add(arr2[j]);
                    }
                    
                    j++;
                }
                else if(j==0){
                    ans.add(arr2[j]);
                    j++;
                }
                else{
                    j++;
                }
            }
           
            
        }
        while(j<m){
            if(j!=0 && arr2[j]!=arr2[j-1]){
                if(ans.size()!=0 && ans.get(ans.size()-1)!=arr2[j]){
                     ans.add(arr2[j]);
                }
                else if(ans.size()==0){
                    ans.add(arr2[j]);
                }
               
                j++;
            }
            else if(j==0){
                ans.add(arr2[j]);
                j++;
            }
            else{
                j++;
            }
        }
        while(i<n){
            if(i!=0 && arr1[i]!=arr1[i-1]){
                if(ans.size()!=0 && ans.get(ans.size()-1)!=arr1[i]){
                     ans.add(arr1[i]);
                }
                else if(ans.size()==0){
                    ans.add(arr1[i]);
                }
                   
                    i++;
                }
                else if(i==0){
                    ans.add(arr1[i]);
                    i++;
                }
               
                else{
                    i++;
                }
        }
        //System.out.println(ans);
        return ans;
    }
}



//https://www.youtube.com/watch?v=JCT04Z94Nyo