package Warmup1;

public class Front22 {
    public String front22(String str) {
        String f;
        if (str.length() >= 2) {
            f = str.substring(0, 2);
        } else {
            f = str;
        }
        return f + str + f;
    }
}
