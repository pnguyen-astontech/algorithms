package com.company;

import java.util.*;

/**
 * Created by petenguy1 on 12/19/2016.
 *
 *      https://www.hackerrank.com/challenges/lonely-integer
 *
 */
public class LonelyInteger {

    public static void main(String[] args) {
        int[] a = {1,1,2,2,3};
        System.out.println(lonelyInteger(a));
    }

    public static int lonelyInteger(int [] a) {
        HashMap<Integer, Integer> intCounts = new HashMap<Integer, Integer>();
        for(int i : a) {
            if (intCounts.containsKey(i))
                intCounts.replace(i, 2);
            else
                intCounts.put(i, 1);
        }

        return intCounts.entrySet().stream().map(x -> x.getKey()).filter(x -> intCounts.get(x).equals(1)).findFirst().get();
    }
}
