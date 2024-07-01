package Task2;

public class P25 {
    public void Solution(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - 1 - i) {
                    System.out.print(s.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
