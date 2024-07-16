package Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            res.put(strings[i], res.getOrDefault(strings[i], 0) + 1);
        }
        return res;
    }

}
