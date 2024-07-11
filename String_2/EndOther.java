package String_2;

public class EndOther {
    public boolean endOther(String a, String b) {
        String small = a.toLowerCase();
        String large = b.toLowerCase();
        if (small.length() > large.length()) {
            String temp = small;
            small = large;
            large = temp;
        }
        return large.substring(large.length() - small.length()).equals(small);
    }
}
