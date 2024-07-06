package String_1;

public class LastChars {
    public String lastChars(String a, String b) {
        String f = "@";
        String l = "@";
        if (a.length() > 0)
            f = a.substring(0, 1);
        if (b.length() > 0)
            l = b.substring(b.length() - 1);
        return f + l;
    }
}
