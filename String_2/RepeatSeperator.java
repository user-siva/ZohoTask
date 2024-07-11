package String_2;

public class RepeatSeperator {
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 1)
            return word;
        if (count == 0)
            return "";
        String res = "";
        for (int i = 1; i < count; i++) {
            res += word;
            res += sep;
        }
        res += word;
        return res;
    }
}
