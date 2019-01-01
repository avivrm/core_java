package com.core.test.main;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String s1 =  new String("POOJA");
        String s2 =  new String("POOJA");
        String s3 =  "POOJA";
        Map<String, String> map = new HashMap<>();
        map.put(s1,"");
        map.put(s2,"");
        map.put(s3,"");

        System.out.print(map.keySet().size());
    }
}
