package Task2;

import java.util.ArrayList;
import java.util.List;

public class P30 {
    public void Solution(int[][] matrix) {
        int n = matrix.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int col = 0; col < n; col++) {
            int startcol = col;
            int startrow = 0;
            List<Integer> temp = new ArrayList<>();
            while (startcol >= 0 && startrow < n) {
                temp.add(matrix[startrow][startcol]);
                startcol -= 1;
                startrow += 1;
            }
            res.add(temp);
        }

        for (int row = 1; row < n; row++) {
            int startcol = n - 1;
            int startrow = row;
            List<Integer> temp = new ArrayList<>();

            while (startrow < n && startcol >= 0) {
                temp.add(matrix[startrow][startcol]);
                startcol -= 1;
                startrow += 1;
            }
            res.add(temp);
        }

        System.out.println(res);

    }
}
