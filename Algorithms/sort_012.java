import java.util.* ;
import java.io.*; 

public class Sort012 {
    public static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                int temp = arr[mid]; arr[mid] = arr[low]; arr[low] = temp;
                low++; mid++;
            } else if(arr[mid] == 2) {
                int temp = arr[mid]; arr[mid] = arr[high]; arr[high] = temp;
                high--;
            } else {
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
