package Logic_2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {
        int s = 0;
        if (a != 13)
            s += a;
        else {
            b = 0;
            c = 0;
        }
        if (b != 13)
            s += b;
        else {
            c = 0;
        }
        if (c != 13)
            s += c;
        return s;
    }
}
