package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class MapSwap {

    public static void main(String[] args) {
        /*Creating map 1*/
        Map<String, String> mapOne = new HashMap<>();
        mapOne.put("val1", "java");
        mapOne.put("val2", "c++");
        /*Creating m 2*/
        Map<String, String> mapTwo = new HashMap<>();
        mapTwo.put("val1", "mars");
        mapTwo.put("val2", "saturn");
        /*Passing the map to the method to swap*/
        System.out.println("Input:\n" + mapOne);
        System.out.println("Output:");
        swap(mapOne);
        System.out.println("\nInput:\n" + mapTwo);
        System.out.println("Output:");
        swap(mapTwo);

    }

    /*Method to swap the values and display the map*/
    public static void swap(Map<String, String> map) {
        String value = map.get("val1");
        map.put("val2", value);
        map.put("val1", " ");

        System.out.println(map);
    }
}
