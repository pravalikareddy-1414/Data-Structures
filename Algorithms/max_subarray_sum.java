import java.util.* ;
import java.io.*; 

public class MaxSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        int max = 0, sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        System.out.println(maxSubarraySum(arr, arr.length));
    }
}
