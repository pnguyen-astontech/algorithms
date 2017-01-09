package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by petenguy1 on 12/8/2016.
 *
 *      https://www.hackerrank.com/challenges/linkedin-practice-caesar-cipher
 *
 */
public class CaesarCipher {

    private static int stringLength;
    private static int encryptionKey;

    private final static int RANGE = 26;
    private final static int LOWER_MIN = 97;
    private final static int LOWER_MAX = 122;
    private final static int UPPER_MIN = 65;
    private final static int UPPER_MAX = 90;

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        stringLength = scanner.nextInt();
        IntStream message = scanner.next().chars();
        encryptionKey = scanner.nextInt();

        message.mapToObj(i -> encrypt(i)).limit(stringLength).forEach(x -> System.out.print((char)(int)x));
    }

    public static int encrypt(int i) {

        if ( i >= UPPER_MIN && i <= UPPER_MAX)
            return (i - UPPER_MIN + encryptionKey) % RANGE + UPPER_MIN;
        else if ( i >= LOWER_MIN && i <= LOWER_MAX)
            return (i - LOWER_MIN + encryptionKey) % RANGE + LOWER_MIN;
        else
            return i;
    }

}
