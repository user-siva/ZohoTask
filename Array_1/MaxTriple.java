package Array_1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];

        if (max < nums[nums.length / 2])
            max = nums[nums.length / 2];

        if (max < nums[nums.length - 1])
            max = nums[nums.length - 1];

        return max;
    }
}
