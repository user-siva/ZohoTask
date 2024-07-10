package Logic_1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(a).length() < String.valueOf(sum).length())
            return a;
        return sum;
    }
}
