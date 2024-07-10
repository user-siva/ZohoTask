package Logic_1;

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        int a1 = Math.abs(a - b);
        int b1 = Math.abs(a - c);
        int c1 = Math.abs(b - c);
        return a1 >= 10 || b1 >= 10 || c1 >= 10;
    }
}
