package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P18 {
    public int[] Solution(int[] arr) {
        int[] res = new int[arr.length];

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        Collections.sort(odd);
        Collections.sort(even, Collections.reverseOrder());

        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                res[i] = even.get(j++);
            else
                res[i] = odd.get(k++);
        }
        return res;
    }
}
