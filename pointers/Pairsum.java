import java.util.*;

// 1. Count distinct pairs with sum equal to target

class PairSumSolution {
    public static int pairSum(int arr[], int n, int target) {
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return (count == 0) ? -1 : count;
    }
}

