package com.xw.j2se.work.module_3;

import java.util.HashMap;
import java.util.Map;

public class CharCountWithMap {

    private static final String a = "123,456,789,123,456";

    public static void main(String[] args) {
        Map<String,Integer> countMap = new HashMap<>();
        String[] aSplit = a.split(",");
        for (String element : aSplit) {
            if(countMap.containsKey(element)) {
                int count = countMap.get(element);
                countMap.put(element,++count);
            } else {
                countMap.put(element,1);
            }
        }
        System.out.println(countMap);
    }


}
