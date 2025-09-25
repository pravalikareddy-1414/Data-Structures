import java.util.*;

public class QuickSortSolution {
    public static List<Integer> quickSort(List<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        qs(arr, low, high);
        return arr;
    }

    public static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            qs(arr, low, partition - 1);
            qs(arr, partition + 1, high);
        }
    }

    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low + 1;
        for (int j = low + 1; j <= high; j++) {
            if (arr.get(j) < pivot) {
                Collections.swap(arr, i, j);
                i++;
            }
        }
        Collections.swap(arr, low, i - 1);
        return i - 1;
    }
}