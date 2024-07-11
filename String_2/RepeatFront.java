package String_2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String res = "";
        int k = n;
        for (int i = 0; i < n; i++) {
            res += str.substring(0, k);
            k -= 1;
        }
        return res;
    }
}
