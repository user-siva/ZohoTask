package Array_2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6)
                flag = true;

            if (!flag)
                sum += nums[i];

            if (flag && nums[i] == 7)
                flag = false;

        }

        return sum;
    }
}
