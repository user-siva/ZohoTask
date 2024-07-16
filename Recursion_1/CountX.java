package Recursion_1;

public class CountX {

    public int recur(String str, int ind) {
        if (ind == str.length())
            return 0;
        if (str.charAt(ind) == 'x') {
            return 1 + recur(str, ind += 1);
        } else {
            return recur(str, ind += 1);
        }
    }

    public int countX(String str) {
        return recur(str, 0);
    }

}