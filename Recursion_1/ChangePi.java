package Recursion_1;

public class ChangePi {

    public String changePi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.substring(0, 2).equals("pi")) {
            return 3.14 + changePi(str.substring(2));
        } else {
            return str.charAt(0) + changePi(str.substring(1));
        }
    }

}
