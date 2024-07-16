package Recursion_1;

public class StrCount {
    public int strCount(String str, String sub) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.length() >= sub.length() && str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        return strCount(str.substring(1), sub);
    }

}
