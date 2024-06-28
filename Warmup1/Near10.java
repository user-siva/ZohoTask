package Warmup1;

public class Near10 {
    public int close10(int a, int b) {
        int a_ = Math.abs(a - 10);
        int b_ = Math.abs(b - 10);
        if (a_ < b_) {
            return a;
        } else if (a_ == b_) {
            return 0;
        } else {
            return b;
        }
    }

}
