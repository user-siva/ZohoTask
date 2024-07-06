package String_1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int m = str.length() / 2;
        return str.substring(m - 1, m + 1);
    }
}
