package Task2;

public class P19 {
    public void pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern2(int n) {

        for (int i = 1; i <= n; i++) {
            int s = 1;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                s++;
            }
            int k = 0;
            for (int j = s; j <= n; j++) {
                System.out.print(j);
                k = j;
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(--k);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}