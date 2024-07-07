package Array_1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int n = 0;
        if (a.length > 0 && a[0] == 1)
            n++;
        if (b.length > 0 && b[0] == 1)
            n++;
        return n;
    }
}
