package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;

public class BooleanCount {
/*Main class to return true for string having count greater than 2*/
    public static void main(String[] args) {
        String str = "a,b,c,d,a,c,c";
        /*Convert string to array*/
        String[] strArray = str.trim().split("[\\s@.?+-_,*]+");
        System.out.println("Input String:\n"+Arrays.toString(strArray));
        /*Convert array to map and stores boolean true if the word count greater than 2*/
        HashMap<String, Boolean> map = new HashMap<>();
        int count = 0;
        /*Adding values to the map*/
        for (String word : strArray) {
            if (map.containsKey(word)) {
                map.put(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println("\nOutput:\n"+map);

    }
}
