package Array_1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int m = nums.length / 2;
        return new int[] { nums[m - 1], nums[m] };
    }
}
