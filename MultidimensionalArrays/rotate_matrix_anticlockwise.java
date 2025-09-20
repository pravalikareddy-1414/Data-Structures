import java.util.*;
import java.io.*;

public class Solution {

    public static void inplaceRotate(int[][] arr, int n) {
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse each column
        for (int col = 0; col < n; col++) {
            int top = 0, bottom = n - 1;
            while (top < bottom) {
                int temp = arr[top][col];
                arr[top][col] = arr[bottom][col];
                arr[bottom][col] = temp;
                top++;
                bottom--;
            }
        }
    }
}