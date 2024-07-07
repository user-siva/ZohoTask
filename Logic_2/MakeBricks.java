package Logic_2;

public class MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int rem = goal >= (5 * big) ? goal - (5 * big) : goal % 5;
        return small >= rem;
    }
}
