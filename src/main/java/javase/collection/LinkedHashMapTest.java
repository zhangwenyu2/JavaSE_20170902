package javase.collection;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(null, "hi");
        map.put(-1, null);
        map.put(999, "hi");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
