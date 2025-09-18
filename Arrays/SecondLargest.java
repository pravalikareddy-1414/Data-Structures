1. SecondLargest.java
import java.util.*;

public class SecondLargest {
    public static int findSecondLargest(int n, int[] arr) {
        if (n < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8};
        System.out.println(findSecondLargest(arr.length, arr)); // Output: 6
    }
}