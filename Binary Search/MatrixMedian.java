import java.util.ArrayList;
import java.util.Collections;

public class MatrixMedian {
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                ar.add(matrix.get(i).get(j));
            }
        }

        Collections.sort(ar);
        int mid = ar.size() / 2;
        return ar.get(mid);
    }
}