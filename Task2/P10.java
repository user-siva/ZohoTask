package Task2;

public class P10 {
    public String[] reverse(String[] arr, int l, int r) {
        if (l < r) {
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }

    public void p10(String s) {
        String[] slist = s.split(" ");
        slist = this.reverse(slist, 0, slist.length - 1);
        String res = "";
        for (String i : slist) {
            res += i + " ";
        }
        System.out.println(res);
    }
}
