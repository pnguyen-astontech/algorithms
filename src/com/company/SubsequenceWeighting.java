package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by petenguy1 on 12/14/2016.
 *
 *      https://www.hackerrank.com/challenges/subsequence-weighting
 */
public class SubsequenceWeighting {

    private static int testCases;
    private static int n;
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            n = scanner.nextInt();
            IntStream stream = IntStream.of(scanner.nextInt());
            stream.forEach(System.out::println);
        }

    }

}
