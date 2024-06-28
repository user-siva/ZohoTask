package Warmup1;

public class In3050 {
    public boolean in3050(int a, int b) {
        boolean one = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean two = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        return one || two;
    }
}
