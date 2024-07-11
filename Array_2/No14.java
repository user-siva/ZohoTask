package Array_2;

public class No14 {
    public boolean no14(int[] nums) {
        int one = 0, four = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                one++;
            if (nums[i] == 4)
                four++;
        }
        return one == 0 || four == 0;
    }
}
