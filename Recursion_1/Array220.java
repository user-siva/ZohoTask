package Recursion_1;

public class Array220 {
    public boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1)
            return false;

        return nums[index + 1] == 10 * nums[index] || array220(nums, index + 1);
    }
}
