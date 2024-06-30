package Task2;

public class P13 {
    public int p13(int[] arr) {
        int res = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < res) {
                res = i;
            }
        }
        return res;
    }
}
