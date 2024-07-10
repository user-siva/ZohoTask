package Logic_1;

public class MaxMod5 {
    public int maxMod5(int a, int b) {
        if (a == b)
            return 0;
        int small, large;
        if (a > b) {
            small = b;
            large = a;
        } else {
            small = a;
            large = b;
        }
        if (a % 5 == b % 5)
            return small;
        return large;
    }
}
