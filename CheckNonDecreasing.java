3. CheckNonDecreasing.java
public class CheckNonDecreasing {
    public static boolean isPossible(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                if (count > 1) return false;

                if (i > 0 && arr[i - 1] > arr[i + 1])
                    arr[i + 1] = arr[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3};
        System.out.println(isPossible(arr, arr.length)); // Output: true
    }
}