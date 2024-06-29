package Task2;

public class P2 {
    public void p2(int a, int b) {
        System.out.println("AND:" + (a & b));
        System.out.println("OR:" + (a | b));
        System.out.println("XOR:" + (a ^ b));
        System.out.println("NOT:" + (~a));
        System.out.println("Left Shift:" + (a << 1));
        System.out.println("Right Shift:" + (b >> 1));
        System.out.println("Unsigned Right Shift:" + (a >>> 2));

    }
}
