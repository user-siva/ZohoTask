package Warmup1;

public class EveryNth {
    public String everyNth(String str, int n) {
        String res = "";
        int i = 0;
        while (i < str.length()) {
            res += str.charAt(i);
            i += n;
        }
        return res;
    }

}
