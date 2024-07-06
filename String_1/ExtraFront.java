package String_1;

public class ExtraFront {
    public String extraFront(String str) {
        int n = str.length();
        if (n >= 2)
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        return str + str + str;
    }
}
