package String_2;

public class XyBalanace {
    public boolean xyBalance(String str) {
        int bal = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x')
                bal += 1;
            if (str.charAt(i) == 'y')
                bal = 0;
        }
        return bal <= 0;
    }
}
