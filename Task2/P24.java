package Task2;

public class P24 {
    public void Solution(int rows) {
        int k = 1;
        int space = rows - 1;
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print(k++);
                System.out.print(" ");
            }
            space -= 1;
            System.out.println();
        }
    }
}
