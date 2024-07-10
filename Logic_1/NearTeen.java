package Logic_1;

public class NearTeen {
    public boolean nearTen(int num) {
        int mod = num % 10;
        return mod <= 2 || (10 - mod) <= 2;
    }
}
