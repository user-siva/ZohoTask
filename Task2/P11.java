package Task2;

public class P11 {
    public String p11(String s) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (Character.isLetter(s.charAt(i))) {
                int j = i + 1;
                StringBuilder num = new StringBuilder();
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    num.append(s.charAt(j));
                    j++;
                }
                int n = Integer.parseInt(num.toString());
                for (int k = 0; k < n; k++) {
                    res.append(s.charAt(i));
                }
                i = j - 1;
            } else {
                i++;
            }
        }
        return res.toString();
    }
}
