package String_1;

public class ComboString {
    public String comboString(String a, String b) {
        String l = a, s = b;
        if (a.length() < b.length()) {
            l = b;
            s = a;
        }
        return s + l + s;
    }
}
