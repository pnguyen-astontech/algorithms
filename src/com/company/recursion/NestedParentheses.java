package com.company.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by petenguy1 on 11/18/2016.
 *
 *      http://codingbat.com/prob/p183174
 *
 *      Input: String
 *      Output: boolean - true when open parentheses has matching close parentheses.
 */
public class NestedParentheses {

    public static void main(String[] args) {

        System.out.println(checkParentheses(removeNonParentheses("(x)+(3333)")));
    }

    public static List<Character> removeNonParentheses(String s) {
        char[] cArray = s.toCharArray();
        List<Character> cList = new ArrayList<>();
        for (char c : cArray) {
            cList.add(c);
        }

        cList = cList.stream()
                .filter(c -> c == '(' || c == ')' )
                .collect(Collectors.toList());

        return cList;
    }

    public static boolean checkParentheses(List<Character> cList) {
        int sLength = cList.size();
        List<Character> rList = new ArrayList<>();

        for (int i = 0; i < sLength-1; i++) {
            if (cList.get(i).equals('(') && cList.get(i+1).equals(')')){
                i++;
            } else {
                rList.add(cList.get(i));
            }

            if (i == sLength-2) {
                rList.add(cList.get(i+1));
            }
        }

        if (rList.size() == 0)
            return true;
        else if (rList.size() == 1 || rList.size() == sLength)
            return false;
        else
            return checkParentheses(rList);
    }
}
