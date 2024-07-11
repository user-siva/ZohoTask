package String_2;

public class GetSandwidtch {
    public String getSandwich(String str) {
        int l = 0, r = 0, c = 0;
        for (int i = 0; i < str.length() - 5; i++) {
            if (c == 2)
                break;
            if (str.substring(i, i + 5).equals("bread")) {
                if (c == 0)
                    l = i + 5;
                else if (c == 1)
                    r = i;
                c++;
            }
        }
        System.out.println(l + " " + r);
        return "";
    }
}
