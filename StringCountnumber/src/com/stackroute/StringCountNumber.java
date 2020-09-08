package com.stackroute;

import java.util.HashMap;

public class StringCountNumber {

    public static void main(String[] args) {
        String str = "one one -one___two,,three,one @three*one?two";
        /*Converting the string to array*/
        String[] strArray = str.trim().split("[\\s@.?+-_,*]+");
        HashMap<String, Integer> map = new HashMap<>();
        int count;
        /*Adding values to the map*/
        for (String word : strArray) {
            if (map.containsKey(word)) {
                count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        /*Display the HashMap*/
        System.out.println(map);
    }
}
