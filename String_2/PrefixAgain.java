package String_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        if (str.length() == 2 && str.charAt(0) == str.charAt(1))
            return true;
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length() - n; i++) {
            if (str.substring(i, i + n).equals(prefix))
                return true;
        }
        return false;
    }
}
