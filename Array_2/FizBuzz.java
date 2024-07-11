package Array_2;

public class FizBuzz {
    public String[] fizzBuzz(int start, int end) {
        String[] res = new String[end - start];
        int k = 0;
        for (int i = start; i < end; i++) {
            int curr = i;
            if (curr % 3 == 0 && curr % 5 == 0) {
                res[k++] = "FizzBuzz";
            } else if (curr % 3 == 0) {
                res[k++] = "Fizz";
            } else if (curr % 5 == 0) {
                res[k++] = "Buzz";
            } else {
                res[k++] = String.valueOf(curr);
            }
        }
        return res;
    }
}
