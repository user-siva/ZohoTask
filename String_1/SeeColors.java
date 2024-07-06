package String_1;

public class SeeColors {
    public String seeColor(String str) {
        int n = str.length();
        if (n >= 3 && str.substring(0, 3).equals("red"))
            return "red";
        if (n >= 4 && str.substring(0, 4).equals("blue"))
            return "blue";
        return "";
    }
}
