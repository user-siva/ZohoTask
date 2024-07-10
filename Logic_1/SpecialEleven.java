package Logic_1;

public class SpecialEleven {
    public boolean specialEleven(int n) {
        int mod = n % 11;
        return mod == 0 || mod == 1;
    }
}
