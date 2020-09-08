package com.stackroute;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String str = "a,b,c,d,a,c,c";
        String[] strArray = str.trim().split("[\\s@.?+-_,*]+");
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        /*Adding values to the map*/
        for (String word : strArray) {
            if (map.containsKey(word)) {
                count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
        System.out.println(count);
    }
}
