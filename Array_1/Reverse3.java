package Array_1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int l = 0, r = nums.length - 1, temp;
        while (l <= r) {
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        return nums;
    }
}
