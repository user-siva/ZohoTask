package String_2;

public class DoubleChar {
    public String doubleChar(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.charAt(i);
            res += str.charAt(i);
        }
        return res;
    }
}
