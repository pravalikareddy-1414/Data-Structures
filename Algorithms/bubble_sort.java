import java.util.* ;
import java.io.*; 

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 4, 10};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
