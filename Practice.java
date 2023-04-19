import java.util.*;
public class Practice {

    public static int reverseInteger(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans*10 +rem;
            num=num/10;
        }
        return ans;
    }

    public static int[] swapalternate(int[] arr){

        for(int i=0;i<arr.length-1;i=i+2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }

    public static int findSingleUnique(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    
    public static int findSingleDuplicate(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int n=arr.length-1;
        int sum2=n*(n+1)/2;
        return sum-sum2;

        // int ans=0;

        // for(int i=0;i<arr.length;i++){
        //     ans=ans^arr[i];
        // }

        // for(int i=1;i<arr.length;i++){
        //     ans=ans^i;
        // }
        // return ans;


    }

    public static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        int j=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr2[j]>arr1[i]){
                i++;
            }
            else if(arr1[i]==arr2[j]){
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }
        return arr;
    }

    public static int[] sortZero12(int[] arr){
        int s=0;
        int mid=0;
        int e=arr.length-1;

        while(mid<=e){
            if(arr[mid]==0){
                int temp=arr[s];
                arr[s]=arr[mid];
                arr[mid]=temp;
                s++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[e];
                arr[e]=arr[mid];
                arr[mid]=temp;
                e--;
            }
        }
        return arr;
    }

    public static ArrayList<ArrayList<Integer>> TripletSum(int[] arr, int sum){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==sum){
                    ArrayList<Integer> put=new ArrayList<>();
                    put.add(arr[i]);
                    put.add(arr[j]);
                    put.add(arr[k]);
                    j++;
                    k--;
                    ans.add(put);
                }
                else if(arr[i]+arr[j]+arr[k]>sum){
                    k--;
                }
                else if(arr[i]+arr[j]+arr[k]<sum){
                    j++;
                }


            }
        }
        return ans;
    }

    public static int[] sortOnezero(int[] arr){
        // int count0=0;
        // //int count1=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count0++;
        //     }
        // }

        // for(int i=0;i<arr.length;i++){
        //     if(count0>0){
        //         arr[i]=0;
        //         count0--;
        //     }
        //     else{
        //         arr[i]=1;
        //     }
        // }
        

        int s=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[s]==0){
                s++;
            }
            else if(arr[s]==1 && arr[e]==0){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
            else if(arr[e]==1){
                e--;
            }
        }
        return arr;
    }


    public static void sortArray(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }

    public static void movezeros(int[] nums){
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[i]!=0 && nums[j]!=0){
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
               j++; 
            }
            else if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }

        //Method 2

        // int k=0;
        // for(int s=0;s<nums.length;s++){
        //     if(nums[s]!=0){
        //         int temp=nums[s];
        //         nums[s]=nums[k];
        //         nums[k]=temp;
        //         k++;
        //     }
        // }


    }

    public static void rotateArray(int[] arr,int k){
        int[] arrnew=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arrnew[(i+k)%arr.length]=arr[i];
        }
        int count=0;
        for(Integer i: arrnew){
            arr[count]=i;
            count++;
        }
    }

    public static boolean SortedRotatedArraycheck(int[] arr){
        int count=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count<=1;

    }
    
    public static ArrayList<Integer> sum2Array(int[] arr1,int[] arr2){
        int n=arr1.length-1;
        int m=arr2.length-1;
        int carry=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(n>=0 && m>=0){
            int sum=arr1[n]+arr2[m]+carry;
            if(sum>9){
                ;
                ans.add(sum%10);
                carry=sum/10;
                n--;
                m--;
            }
            else{
                ans.add(sum);
                carry=sum/10;
                n--;
                m--;
            }
        }
        while(n>=0){
            ans.add((arr1[n]+carry)%10);
            carry=(arr1[n]+carry)/10;
            System.out.println(carry);
            n--;
        }
        while(m>=0){
            ans.add((arr2[m]+carry)%10);
            carry=(arr2[m]+carry)/10;
            System.out.println(carry);
            m--;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
    
    public static String RandomString(int n){

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int index=(int)(62*Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    static String decodedString(String S){
        // code here
        
        Stack<String> st=new Stack<>();
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!=']'){
                st.push(String.valueOf(S.charAt(i)));
            }
            else{
                String s="";
                
                while(!(st.peek().equals("["))){
                    s=st.pop()+s;
                }
                st.pop();
                int inte=Integer.parseInt(st.pop());
                while(inte>0){
                    st.push(s);
                    inte--;
                }
            }
        }
        
        String fin="";
        while(!st.isEmpty()){
            fin=st.pop()+fin;
        }
        return fin;
    }

    

    
    public static void main(String[] args){
        // int[]arr1={9,9,9}; // 2 5 5 5 10
        // int[]arr2={9,9,9,9,9,9,9};
        // ArrayList<Integer> arr=sum2Array(arr1, arr2);
        // for(Integer i:arr){
        //     System.out.print(i+" ");
        // }

        String ans=decodedString("3[b2[ca]]");
        System.out.println(ans);
        
        
    }
    //hxqb5NvWk
}

// class User{
//     public String username;
//     public int userId;
//     public String location;

//     User(String username,int userId,String location){
//         this.username=username;
//         this.userId=userId;
//         this.location=location;
//     }
// }

// class Useruse{

//     public static  

//     public static void main(String[] args){
//         ObjectMapper om=new ObjectMapper();
//         List<User> lu=new ArrayList<>();
//         User[] userArray=om.readValue(input,User[].class);
//         Arrays.sort(userArray,(User u1,User u2) ->{
//             if(u1.username.compareToIgnoreCase(u2.username)>0){
//                 return -1;
//             }
//             else if(u1.username.compareToIgnoreCase(u2.username)<0){
//                 return 1;
//             }
//             else{
//                 return 0;
//             }
//         });

//     }
// }

