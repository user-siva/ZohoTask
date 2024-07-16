package Map_1;

import java.util.Map;

public class MapAB4 {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a_ = map.get("a");
            String b_ = map.get("b");
            if (a_.length() > b_.length()) {
                map.put("c", a_);
            } else if (a_.length() < b_.length()) {
                map.put("c", b_);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

}
