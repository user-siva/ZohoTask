package Task2;

public class P6 {
    public void p6() {
        int a = 5;
        int b = 5;
        System.out.println(++a - b--);
        a = 5;
        b = 5;
        System.out.println(a % b++);
        a = 5;
        b = 5;
        System.out.println(a *= b + 5);
        int x = 69 >>> 2;
        System.out.println(x);
    }

    public void p7() {
        int a = 28;
        System.out.println(a += a++ + ++a + --a + a--);
    }
}