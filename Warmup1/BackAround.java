package Warmup1;

public class BackAround {
    public String backAround(String str) {
        char a = str.charAt(str.length() - 1);
        return a + str + a;
    }
}
