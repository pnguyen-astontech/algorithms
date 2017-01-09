package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by petenguy1 on 12/20/2016.
 *
 *      https://www.hackerrank.com/challenges/kmp-fp
 */
public class SubstringSearch {

    private static int testCases;
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        testCases = Integer.parseInt(scanner.nextLine());
        IntStream.range(0, testCases).mapToObj(x -> scanner.nextLine().contains(scanner.nextLine()) ? "YES" : "NO").forEach(System.out::println);
    }

}
