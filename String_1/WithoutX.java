package String_1;

public class WithoutX {
    public String withoutX(String str) {
        int l = 0;
        int r = str.length();

        if (str.length() > 0 && str.charAt(0) == 'x')
            l = 1;

        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x')
            r--;

        return str.substring(l, r);
    }
}
