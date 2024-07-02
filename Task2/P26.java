package Task2;

public class P26 {
    public void Solution(int n) {
        int k = n;
        int space = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {

            if (i <= n) {
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
                System.out.println();
                if (i < n) {
                    k -= 1;
                    space += 2;
                }
            } else {
                k += 1;
                space -= 2;
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
