package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by petenguy1 on 11/17/2016.
 *
 *      https://projecteuler.net/problem=112
 *
 *      Input: None
 *      Output:     - Count of how many numbers tested
 *                  - Count of how many bouncy numbers existed
 *                  - Percentage of bouncy numbers
 *
 */
public class BouncyNumbers {

    public static void main(String[] args) {
        boolean cont = true;
        int n = 0;
        int bcnt = 0;
        while(cont) {
            if (isBouncy(n))
                bcnt++;
            n++;
            if ((bcnt /(float) n) > .99)
                cont = false;
        }
        System.out.println(n);
        System.out.println(bcnt);
        System.out.println((bcnt/(float) n));
    }

    public static boolean isBouncy(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        List<Character> original = new ArrayList<>();
        List<Character> increasing = new ArrayList<>();
        List<Character> decreasing = new ArrayList<>();
        for ( char c : digits) {
            original.add(c);
            increasing.add(c);
            decreasing.add(c);
        }

        Collections.sort(increasing, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Character.compare(c1, c2);
            }
        });

        Collections.sort(decreasing, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Character.compare(c2, c1);
            }
        });

        if (original.equals(increasing) || original.equals(decreasing))
            return false;
        else
            return true;

    }
}
