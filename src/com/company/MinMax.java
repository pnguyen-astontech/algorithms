package com.company;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by petenguy1 on 12/7/2016.
 *
 *      https://www.hackerrank.com/challenges/mini-max-sum
 *
 */
public class MinMax {

    private static long max = Long.MIN_VALUE;
    private static long min = Long.MAX_VALUE;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long sum = Stream.of(scanner.nextLine().split(" ")).mapToLong(MinMax::check).sum();

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static long check(String x) {
        long number = Long.parseLong(x);
        max = number > max ? number : max;
        min = number < min ? number : min;
        return number;
    }
}
