package Logic_2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        int s = 0;
        if (a != b && a != c)
            s += a;
        if (b != a && b != c)
            s += b;
        if (c != a && c != b)
            s += c;

        return s;
    }
}
