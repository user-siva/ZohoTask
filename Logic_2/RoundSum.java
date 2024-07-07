package Logic_2;

public class RoundSum {
    public int round10(int n) {
        int rem = n % 10;
        if (rem >= 5)
            return n + 10 - rem;
        return n - rem;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

}