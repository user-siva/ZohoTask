package Task2;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                arr[k] = nums[i];
                k++;
            }
        }
        return arr;
    }
}
