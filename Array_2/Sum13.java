package Array_2;

public class Sum13 {
    public int sum13(int[] nums) {
        int sum = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == 13 && i < nums.length - 1) {
                i += 2;
                continue;
            }
            if (nums[i] != 13) {
                sum += nums[i];
            }
            i += 1;
        }
        return sum;
    }
}
