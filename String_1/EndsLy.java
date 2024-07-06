package String_1;

public class EndsLy {
    public boolean endsLy(String str) {
        int n = str.length();
        if (n >= 2) {
            if (str.substring(n - 2).equals("ly")) {
                return true;
            }
        }
        return false;
    }
}
