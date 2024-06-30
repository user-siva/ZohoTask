package Task2;

import java.util.Arrays;

public class P17 {
    public int[] Solution(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.sort(result);
        int l = 0, r = arr.length - 1, k = 0;
        while (l <= r) {
            if (k % 2 == 0) {
                result[k] = arr[r];
                r--;
            } else {
                result[k] = arr[l];
                l++;
            }
            k++;
        }
        return result;
    }
}
