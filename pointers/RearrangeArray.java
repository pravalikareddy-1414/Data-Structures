class RearrangeArraySolution {
    public static int[] separateNegativeAndPositive(int a[]) {
        int left = 0, right = a.length - 1;

        while (left < right) {
            if (a[left] < 0) {
                left++;
            } else if (a[right] >= 0) {
                right--;
            } else {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return a;
    }
}