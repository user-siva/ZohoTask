package Task2;

public class P27 {
    public int Solution(String str1, String str2) {
        StringBuilder curr_str = new StringBuilder();
        int str1Len = str1.length();
        int str2Len = str2.length();

        for (int i = 0; i < str2Len; i++) {
            curr_str.append(str1.charAt(i));
        }
        if (str2.equals(curr_str.toString())) {
            return 0;
        }
        int l = 0;
        for (int r = str2Len; r < str1Len; r++) {
            curr_str.append(str1.charAt(r));
            curr_str.deleteCharAt(0);
            l++;
            if (str2.equals(curr_str.toString())) {
                return l;
            }
        }
        return -1;
    }
}
