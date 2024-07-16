package Recursion_1;

public class Count7 {
    public int recur(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 7) {
            return 1 + recur(n / 10);
        } else {
            return recur(n / 10);
        }
    }

    public int count7(int n) {
        return recur(n);
    }

}
