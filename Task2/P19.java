package Task2;

import java.util.*;

public class P19 {
    public void solution(List<List<Integer>> mat) {
        List<List<Integer>> res = new ArrayList<>();
        for (int col = 2; col >= 0; col--) {

            List<Integer> arr = new ArrayList<>();
            for (int row = 0; row < mat.size(); row++) {
                arr.add(mat.get(row).get(col));
            }
            res.add(arr);
        }
        System.out.println(res);
    }
}
