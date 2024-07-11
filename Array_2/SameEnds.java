package Array_2;

public class SameEnds {

    public boolean sameEnds(int[] nums, int len) {
        int i = 0, j = nums.length - len;
        while (j < nums.length) {
            if (nums[i] != nums[j])
                return false;
            i++;
            j++;
        }
        return true;
    }

}