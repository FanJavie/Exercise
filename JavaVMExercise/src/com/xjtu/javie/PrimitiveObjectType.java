package com.xjtu.javie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Javie on 16/5/23.
 */
public class PrimitiveObjectType {

    public static void objectExample() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "1");
        Map<String, String> map2 = map1;
        map2.put("key1", "2");
        System.out.println("map2 value is " + map2.get("key1"));
        System.out.println("map1 value is " + map1.get("key1"));
    }

    public static void primitiveExample() {
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        objectExample();
        System.out.println();
        primitiveExample();
    }
}
