package String_1;

public class Right2 {
    public String right2(String str) {
        int n = str.length();
        return str.substring(n - 2) + str.substring(0, n - 2);
    }

}
