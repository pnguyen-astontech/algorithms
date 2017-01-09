package com.company.helpers;

/**
 * Created by petenguy1 on 12/20/2016.
 *
 *      Custom helpers for math functions
 */
public class MathHelper {

    public static int gdc(int x, int y) {
        return x == y ? x : x % y == 0 ? y : gdc(y, x % y);
    }
}
