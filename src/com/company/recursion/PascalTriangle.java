package com.company.recursion;

import java.util.Scanner;

/**
 * Created by petenguy1 on 12/13/2016.
 */
public class PascalTriangle {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Takes in number of rows to print pascal triangle
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            StringBuilder pascal = new StringBuilder();
            System.out.println(new String(new char[rows-i]).replace("\0", " ") + getPascalString(pascal, i, 0));
        }
    }

    public static String getPascalString(StringBuilder pascal, int row, int k) {
        if ( row < k )
            return pascal.toString();
        else {
            return getPascalString(pascal.append(binomial(row, k) + " "), row, k + 1);
        }
    }

    public static int binomial(int n, int k) {
        return factorial(1, n) / (factorial(1, k) * factorial(1, n-k));
    }

    public static int factorial(int total, int n) {
        if (n <= 1)
            return total;
        else
            return factorial(total*n, n-1);
    }
}
