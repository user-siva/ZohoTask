package Array_2;

public class Post4 {
    public int[] post4(int[] nums) {
        int ind = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                ind = i;
                break;
            }
        }
        int[] res = new int[nums.length - ind - 1];
        int k = 0;
        for (int i = ind + 1; i < nums.length; i++) {
            res[k++] = nums[i];
        }
        return res;
    }

}
