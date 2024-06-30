package Task2;

public class P12 {
    public boolean p12(char c) {
        int ascii = c;
        if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
            return true;
        }
        return false;
    }
}
