package Task2;

public class Main {
    public static void main(String[] args) {
        P18 p = new P18();
        int[] res = p.Solution(new int[] { 13, 2, 4, 15, 12, 10, 5 });
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            System.out.print(",");
        }
    }
}
