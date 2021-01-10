package com.company;

import java.util.HashMap;
import java.util.Map;

public class EngToTrDictionary {

    public static void engToTrDictionaryExample() {
        Map<String,String> engToTr = new HashMap<String, String>();
        engToTr.put("tree", "ağaç");
        engToTr.put("big", "buyuk");
        engToTr.put("calm", "sakin");
        engToTr.put("dry", "kuru");
        engToTr.put("elect", "seçmek");

        System.out.println(engToTr.containsKey("tree"));

        System.out.println(engToTr.keySet());
        System.out.println("----values---");
        System.out.println(engToTr.values());
    }

}
