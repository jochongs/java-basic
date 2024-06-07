package ch11;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();

        map.put("key", "value");
        map.put("key", "value2"); // 덮어 씌움

        System.out.println(map);
    }
}
