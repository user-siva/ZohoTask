package String_2;

public class CatDog {
    public boolean catDog(String str) {
        int catCount = 0, dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String s = str.substring(i, i + 3);
            if (s.equals("cat"))
                catCount += 1;
            if (s.equals("dog"))
                dogCount += 1;
        }
        return catCount == dogCount;
    }
}