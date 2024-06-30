package Task2;

public class P16 {
    public int[] Solution(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else if (arr1[i] > arr2[j]) {
                res[k] = arr2[j];
                j++;
                k++;
            } else {
                res[k] = arr1[i];
                j++;
                i++;
                k++;
            }
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
}
