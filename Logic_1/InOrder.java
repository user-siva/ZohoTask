package Logic_1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if ((b > a && c > b) || (bOk && c > b))
            return true;
        return false;
    }
}
