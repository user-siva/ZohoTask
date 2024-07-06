package String_1;

public class FrontAgain {
    public boolean frontAgain(String str) {
        int n = str.length();
        if (n < 2) {
            return false;
        }
        return str.substring(0, 2).equals(str.substring(n - 2));
    }
}
