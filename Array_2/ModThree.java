package Array_2;

public class ModThree {
    public boolean modThree(int[] nums) {
        int even = 0, odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even == 3 || odd == 3)
                return true;
            if (nums[i] % 2 == 0) {
                even++;
                odd = 0;
            } else {
                odd++;
                even = 0;
            }
            ;
        }
        return even == 3 || odd == 3;
    }
}
