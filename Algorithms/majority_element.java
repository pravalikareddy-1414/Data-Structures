import java.io.*;
import java.util.* ;

public class MajorityElement {
    public static int findMajority(int[] arr, int n) {
        int candidate = 0, count = 0;
        for(int i = 0; i < n; i++) {
            if(count == 0) candidate = arr[i];
            if(candidate == arr[i]) count++;
            else count--;
        }
        int actualCount = 0;
        for(int i = 0; i < n; i++) if(arr[i] == candidate) actualCount++;
        return actualCount > n/2 ? candidate : -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(findMajority(arr, arr.length));
    }
}
