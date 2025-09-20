import java.util.*;

public class Solution {

    public static void spiralPrint(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) arr.add(matrix[top][i]);
            top++;
            for (int i = top; i <= bottom; i++) arr.add(matrix[i][right]);
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) arr.add(matrix[bottom][i]);
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) arr.add(matrix[i][left]);
                left++;
            }
        }

        for (int item : arr) System.out.print(item + " ");
    }
}