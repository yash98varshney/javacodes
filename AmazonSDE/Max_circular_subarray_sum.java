package AmazonSDE;

//Advance of KADANE algo 
public class Max_circular_subarray_sum {

    private static int kadane(int[] arr, int n) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum > maxSum) {
                maxSum = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxSum;
    }

    static int circularSubarraySum(int a[], int n) {

        // Your code here

        int x = kadane(a, n);
        int y = 0;

        for (int i = 0; i < n; i++) {
            y += a[i];
            a[i] *= -1;
        }
        int z = kadane(a, n);
        if (y + z == 0) {
            return x;
        } else {
            return Math.max(x, y + z);
        }

    }
}
