package Array_2;

public class MatchUp {
    public int matchUp(int[] nums1, int[] nums2) {
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i])
                res++;
        }
        return res;
    }
}
