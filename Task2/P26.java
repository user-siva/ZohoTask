package Task2;

public class P26 {
    public void Solution(int n) {
        int sum = 0, j = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + j;

            j = (j * 10) + 1;
        }
        System.out.println(sum);
    }
}
