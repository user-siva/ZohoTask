package Logic_2;

public class NoTeenSum {
    public boolean fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16)
            return true;
        return false;
    }

    public int noTeenSum(int a, int b, int c) {
        int s = 0;
        if (!fixTeen(a))
            s += a;
        if (!fixTeen(b))
            s += b;
        if (!fixTeen(c))
            s += c;
        return s;
    }

}
