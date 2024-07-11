package String_2;

public class OneTwo {
    public String oneTwo(String str) {
        int f = 0, s = 1;
        int n = str.length();
        String res = "";
        while (s < n - 1) {
            res += str.substring(s, s + 2);
            res += str.charAt(f);
            s += 3;
            f += 3;
        }
        return res;
    }
}
