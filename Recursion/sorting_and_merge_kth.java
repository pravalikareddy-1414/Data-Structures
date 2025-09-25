// File 1: MergeSortSolution.java
import java.util.*;

public class MergeSortSolution {
    public static void mergeSort(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        ms(arr, low, high);
    }

    public static void ms(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        ms(arr, low, mid);
        ms(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) temp.add(arr[left++]);
            else temp.add(arr[right++]);
        }
        while (left <= mid) temp.add(arr[left++]);
        while (right <= high) temp.add(arr[right++]);

        for (int i = 0; i < temp.size(); i++) arr[low + i] = temp.get(i);
    }
}