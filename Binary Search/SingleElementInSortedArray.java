import java.util.ArrayList;

public class SingleElementInSortedArray {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid % 2 != 0) {
                mid--;
            }

            if (arr.get(mid).equals(arr.get(mid + 1))) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return arr.get(low);
    }
}