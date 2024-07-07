package Array_1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int a_sum = a[0] + a[1];
        int b_sum = b[0] + b[1];
        if (a_sum >= b_sum)
            return a;
        else
            return b;
    }
}
