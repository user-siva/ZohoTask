package Array_1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int a = Math.max(nums[0], nums[nums.length - 1]);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a;
        }
        return nums;
    }
}
