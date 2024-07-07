package Array_1;

public class Double23 {
    public boolean double23(int[] nums) {
        int two = 0, three = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                two++;
            if (nums[i] == 3)
                three++;
        }
        return two == 2 || three == 2;
    }
}
