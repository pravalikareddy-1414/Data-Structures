import java.util.*;
import java.io.*;

public class Solution {

    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int coverage = 0;
        for (int i = 0; i < mat.size(); i++) {
            for (int j = 0; j < mat.get(i).size(); j++) {
                if (mat.get(i).get(j) == 0) {
                    if (i > 0 && mat.get(i - 1).get(j) == 1) coverage++;
                    if (i < mat.size() - 1 && mat.get(i + 1).get(j) == 1) coverage++;
                    if (j > 0 && mat.get(i).get(j - 1) == 1) coverage++;
                    if (j < mat.get(i).size() - 1 && mat.get(i).get(j + 1) == 1) coverage++;
                }
            }
        }
        return coverage;
    }
}
