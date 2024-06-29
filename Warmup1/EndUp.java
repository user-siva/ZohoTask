package Warmup1;

public class EndUp {
    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        int n = str.length() - 3;
        String front = str.substring(0, n);
        String back = str.substring(n);

        return front + back.toUpperCase();
    }
}
