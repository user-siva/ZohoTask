package String_2;

public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String k = str.substring(str.length() - n);
        String res = "";
        for (int i = 0; i < n; i++) {
            res += k;
        }
        return res;
    }
}
