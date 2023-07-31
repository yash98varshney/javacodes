package AmazonSDE;

public class Find_Frequecy_in_range_1_N {
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        for (int i = 0; i < N; i++) {
            arr[i] -= 1;
        }
        for (int i = 0; i < N; i++) {
            int x = arr[i];
            arr[x % N] = arr[x % N] + N;
        }
        for (int i = 0; i < N; i++) {
            arr[i] /= N;
        }
    }

    void findFreq(int[] arr, int n) {
        int expectedPos, pos = 0;
        while (pos < n) {
            expectedPos = arr[pos] - 1;
            if (arr[pos] > 0 && arr[expectedPos] > 0) {
                arr[pos] = arr[expectedPos];
                arr[expectedPos] = -1;
            } else if (arr[pos] > 0) {
                arr[expectedPos]--;
                arr[pos++] = 0;
            } else {
                pos++;
            }
        }
        // for (int i=0;i<n;i++)
        // {
        // System.out.print("%d -> %d\n", i+1, Math.abs(arr[i]));
        // }
    }

}

// Calculate frequency of elemets if elements are in range 1-N only in O(1)
// space .
// https://www.youtube.com/watch?v=B2hI-QPoisk
