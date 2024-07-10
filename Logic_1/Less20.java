package Logic_1;

public class Less20 {
    public boolean less20(int n) {
        int mod = n % 20;
        return (20 - mod) == 1 || (20 - mod) == 2;
    }
}
