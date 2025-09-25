import java.util.*;

public class KthElementMergedArrays {
    public static int findKthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int M = arr1.size();
        int N = arr2.size();
        int low = 0, low1 = 0, val = 0, count = 0;

        while (low < M && low1 < N) {
            if (arr1.get(low) <= arr2.get(low1)) val = arr1.get(low++);
            else val = arr2.get(low1++);

            count++;
            if (count == k) return val;
        }

        while (low < M) {
            val = arr1.get(low++);
            count++;
            if (count == k) return val;
        }

        while (low1 < N) {
            val = arr2.get(low1++);
            count++;
            if (count == k) return val;
        }

        return -1;
    }
}