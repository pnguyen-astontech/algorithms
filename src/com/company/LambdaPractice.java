package com.company;

import java.util.Scanner;

/**
 * Created by petenguy1 on 12/14/2016.
 *
 *
 *      https://www.hackerrank.com/challenges/java-lambda-expressions
 */
public class LambdaPractice {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LambdaPractice lambdaPractice = new LambdaPractice();

        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            switch (scanner.nextInt()) {
                case 1:
                    if (operate(scanner.nextInt(), lambdaPractice.is_odd))
                        System.out.println("ODD");
                    else
                        System.out.println("EVEN");
                    break;
                case 2:
                    if (operate(scanner.nextInt(), lambdaPractice.is_prime))
                        System.out.println("PRIME");
                    else
                        System.out.println("COMPOSITE");
                    break;
                case 3:
                    if (operate(scanner.nextInt(), lambdaPractice.is_palindrome))
                        System.out.println("PALINDROME");
                    break;
                default:
                    break;
            }
        }
    }

    interface PerformOperation {
        boolean operation(int a);
    }

    private static boolean operate (int a, PerformOperation performOperation) {
        return performOperation.operation(a);
    }

    private PerformOperation is_odd = (int a) -> a % 2 == 1;
    private PerformOperation is_prime = (int a) -> {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        };
        return true;
    };

    private PerformOperation is_palindrome = (int a) -> {
        char[] ca = Integer.toString(a).toCharArray();
        if (ca.length <= 1)
            return true;
        else
            return false;
    };

}
