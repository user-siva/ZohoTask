package Array_2;

public class BigDiff {
    public int bigDiff(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }
        return max - min;
    }
}
