import java.util.* ;
import java.io.*; 

public class SelectionSort {
    public static void selectionSort(int arr[], int n) {
        for(int i = 0; i < n-1; i++) {
            int min = i;
            for(int j = i; j < n; j++) {
                if(arr[j] <= arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {29, 72, 98, 13, 87, 66, 52, 51, 36};
        selectionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
