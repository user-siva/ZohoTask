package Warmup1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean one = (a >= 13 && a <= 19);
        boolean two = (b <= 19 && b >= 13);
        return (one && !two) || (!one && two);
    }
}
