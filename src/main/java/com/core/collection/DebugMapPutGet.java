package main.java.com.core.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DebugMapPutGet {

    public static void main(String[] args) {
        Map<String, Integer> cmap = new ConcurrentHashMap();

        Map<String, Integer> map = new HashMap();

        cmap.put("CA",1);

        cmap.put("CB",1);

        cmap.put("CC",1);

        cmap.put("CA",2);

        cmap.put("CD",3);

        cmap.put("CC",1);

        cmap.put("CC",3);

        map.put("A",1);

        map.put("B",1);

        cmap.get("CA");

        map.get("A");
    }
}
