package Logic_1;

public class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int a1 = a % 10;
        int b1 = b % 10;
        int c1 = c % 10;
        return a1 == b1 || b1 == c1 || a1 == c1;
    }
}
