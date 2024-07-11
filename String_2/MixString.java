package String_2;

public class MixString {
    public String mixString(String a, String b) {
        int i = 0, j = 0;
        String res = "";
        while (i < a.length() && j < b.length()) {
            res += a.charAt(i++);
            res += b.charAt(j++);
        }
        if (i < a.length())
            res += a.substring(i);
        if (j < b.length())
            res += b.substring(j);
        return res;
    }
}
