package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by petenguy1 on 11/21/2016.
 *
 *      http://codingbat.com/prob/p117630
 *
 *      Inputs: String array
 *      Outputs: Hash map with individual strings as key and integer value of string count.
 */
public class WordCount {

    public static void main(String[] args) {

        String[] st = {".", "a", "b", "a", "A", "TTEST", ","};
        wordCount(st).forEach((k,v) -> System.out.println(k + " " + v));

    }

    public static Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> rMap = new HashMap<>();

        for (String s : strings) {
            if (rMap.containsKey(s)) {
                rMap.replace(s, rMap.get(s)+1 );
            } else {
                rMap.put(s, 1);
            }
        }

        return rMap;
    }
}
