package Warmup1;

public class StringE {
    public boolean stringE(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                cnt += 1;
            }
        }
        return cnt >= 1 && cnt <= 3;
    }

}
