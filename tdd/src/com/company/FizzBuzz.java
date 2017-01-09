package com.company;

import java.util.stream.IntStream;

/**
 * Created by petenguy1 on 11/22/2016.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        // Direct evaluation
//        IntStream.range(1, 101)
//                .mapToObj(fizzle -> fizzle % 15 == 0 ? "FizzBuzz"
//                        : fizzle % 3 == 0 ? "Fizz"
//                        : fizzle % 5 == 0 ? "Buzz"
//                        : String.valueOf(fizzle))
//                .forEach(System.out::println);

        // Call method
        IntStream.range(1, 101)
                .mapToObj(fizzle -> fizzBuzz(fizzle))
                .forEach(System.out::println);
    }

    public static String fizzBuzz(int i) {
        // Using standard flow control
//        if (i % 15 == 0) {
//            return "FizzBuzz";
//        } else if (i % 5 == 0) {
//            return "Buzz";
//        } else if (i % 3 == 0) {
//            return "Fizz";
//        } else {
//            return Integer.toString(i);
//        }

        // Using ternary operations
        return (i % 15 == 0 ? "FizzBuzz"
                : i % 5 == 0 ? "Buzz"
                : i % 3 == 0 ?  "Fizz"
                : Integer.toString(i));
    }

}
