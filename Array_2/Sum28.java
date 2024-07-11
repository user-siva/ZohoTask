package Array_2;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int s = 0;
        for (int i : nums) {
            if (i == 2)
                s += 2;
        }
        return s == 8;
    }

}
