import java.util.* ;
import java.io.*; 

public class SquareRoot {

    public static int sqrtN(long N) {
        long low = 1;
        long high = N;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == N) {
                return (int) mid;
            }
            if (mid * mid < N) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}