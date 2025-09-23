import java.util.* ;
import java.io.*; 

public class InsertionSort {
    public static void insertionSort(int n , int[] arr) {
        for(int i = 0; i < n; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2};
        insertionSort(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }
}
