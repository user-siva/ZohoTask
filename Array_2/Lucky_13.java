package Array_2;

public class Lucky_13 {
    public boolean lucky13(int[] nums) {
        for (int i : nums) {
            if (i == 1 || i == 3)
                return false;
        }
        return true;
    }
}
