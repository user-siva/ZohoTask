package String_2;

public class SameStarChar {
    public boolean sameStarChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i != 0 && i != str.length() - 1) {
                    if (str.charAt(i - 1) == str.charAt(i + 1))
                        continue;
                    else
                        return false;
                }

            }
        }
        return true;
    }
}
