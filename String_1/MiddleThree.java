package String_1;

public class MiddleThree {
    public String middleThree(String str) {
        int m = str.length() / 2;
        return str.substring(m - 1, m + 2);
    }
}
