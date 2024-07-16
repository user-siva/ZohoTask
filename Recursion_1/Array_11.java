package Recursion_1;

public class Array_11 {
    public int array11(int[] nums, int index) {
        if (nums.length == 0)
            return 0;
        if (index == nums.length - 1) {
            if (nums[index] == 11)
                return 1;
            else
                return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, ++index);
        } else {
            return array11(nums, ++index);
        }
    }
}
