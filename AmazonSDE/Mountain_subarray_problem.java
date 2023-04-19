package AmazonSDE;
import java.util.*;
public class Mountain_subarray_problem {
    public ArrayList<Boolean> processQueries(int[] a, int n, ArrayList<Pair> queries,
            int q) {
        // code here
        ArrayList<Boolean> ans = new ArrayList<>();
        for (Pair p : queries) {
            int start = p.l;
            int end = p.r;

            boolean b = checkMountain(a, n, start, end);
            if (b) {
                ans.add(true);

            } else {
                ans.add(false);
            }

        }
        return ans;
    }

    public boolean checkMountain(int[] arr, int n, int start, int end) {
        int i = start;

        while (i + 1 <= end && arr[i] <= arr[i + 1]) {
            i++;
        }
        while (i + 1 <= end && arr[i] >= arr[i + 1]) {
            i++;
        }
        if (i == end) {
            return true;
        } else {
            return false;
        }
    }
}

class Pair{
    int l,r;
    Pair(int l,int r){
        this.l=l;
        this.r=r;
    }
}