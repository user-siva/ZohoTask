package Array_1;

public class MidThree {
    public int[] midThree(int[] nums) {
        int m = nums.length / 2;
        return new int[] { nums[m - 1], nums[m], nums[m + 1] };
    }
}
