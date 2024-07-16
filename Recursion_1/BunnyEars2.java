package Recursion_1;

public class BunnyEars2 {
    public int recur(int bunnies) {
        if (bunnies == 0)
            return 0;
        if (bunnies % 2 == 0) {
            return 3 + recur(bunnies - 1);
        } else {
            return 2 + recur(bunnies - 1);
        }
    }

    public int bunnyEars2(int bunnies) {
        return recur(bunnies);
    }

}
