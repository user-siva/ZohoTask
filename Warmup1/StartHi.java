package Warmup1;

public class StartHi {
    public boolean startHi(String str) {
        if (str.length() >= 2 && str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return true;
        } else {
            return false;
        }
    }
}
