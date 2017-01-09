package com.company.recursion;

import java.util.Scanner;

/**
 * Created by petenguy1 on 12/20/2016.
 */
public class GCD {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(gdc(scanner.nextInt(),scanner.nextInt()));
    }

    public static int gdc(int x, int y) {
        return x == y ? x : x % y == 0 ? y : gdc(y, x%y);
    }
}
