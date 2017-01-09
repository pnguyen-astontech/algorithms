package com.company.recursion;

/**
 * Created by petenguy1 on 11/18/2016.
 *
 *      http://codingbat.com/prob/p158888
 *
 *      Input: int n, int power
 *      Output: Returns n^p, if p <=0 will return 1.
 */
public class PowerN {

    public static void main(String[] args) {
        System.out.println(powN(3, 3));

    }

    public static int powN(int n, int p) {

        if (p <= 0)
            return 1;
        if (p == 1)
            return n;
        else
            return n*powN(n, p-1);
    }
}
