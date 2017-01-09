package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Created by petenguy1 on 11/22/2016.
 */
public class StreamTesting {

    public static void main(String[] args) {
//        List<String> numList = new ArrayList<>();
//
//        IntStream.range(1, 101)
//                .forEach(i -> numList.add(Integer.toString(i)));
//
//        Stream<String> stream = Stream.of(numList.toString().split(","));
//
//        stream.forEach(System.out::println);

//        long start = System.nanoTime();
//
//        Long sum = 0L; // Swap "Long" for "long" and speed dramatically improves.
//        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
//            sum += i;
//        }

        List<Integer> list = Arrays.asList(1, 2, 3);
//        list.stream().filter(n -> n%2==0).mapToInt(n -> n).sum();
//        System.out.println(list.parallelStream().reduce(0, Integer::sum));
//        System.out.format("%f Seconds", (System.nanoTime() - start) / 1000000000.0);
//          whileLoop();
//          forLoop();
        //System.out.println(mult(2, 4));

        Integer.toString(12345).chars().map(c -> c - '0').forEach(System.out::println);

        String s = "HEY";
        s = "TEST";
    }

    public static int mult(int x, int y) {
        if (x > y) {
            int z = x;
            x = y;
            y = z;
        }
        return helper(0, x, y);
    }

    public static int helper(int sum, int x, int y) {
        if (x == 0)
            return sum;
        else
            return helper(sum+y, x-1, y);
    }

    public static void whileLoop() {
        int k = 2;
        do {
            System.out.println(k);
        } while(--k > 0);
    }

    public static void forLoop() {
        for(int i = 2; i > 0; i--){
            System.out.println(i);
        }
    }

}


