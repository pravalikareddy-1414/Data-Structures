4. EquilibriumIndex.java
public class EquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) totalSum += num;

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(arrayEquilibriumIndex(arr)); // Output: 2
    }
}