package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by petenguy1 on 12/20/2016.
 *
 *      Benchmark testing
 */
public class Benchmark {

    public static void main(String[] args) {
        //forLoopIteratorTest(100);
        streamVsForTest(1000);
    }

    // region TESTS

    public static void forLoopIteratorTest(int n) {
        List<Double> delta = new ArrayList<>();

        long start1, start2;
        double end1, end2;
        int sum;

        for (int j = 0; j < n; j++) {
            sum = 0;
            start1 = System.nanoTime();
            for (int i = 0; i < 1000000; i++) {
                sum *= ((2+i)-6)/3;
            }
            end1 = (System.nanoTime() - start1) / 1000000000.0;

            sum = 0;
            start2 = System.nanoTime();
            for (int i = 0; i < 1000000; ++i) {
                sum *= ((2+i)-6)/3;
            }
            end2 = (System.nanoTime() - start2) / 1000000000.0;

            delta.add(end1 - end2);
        }

        System.out.format("mean delta: %f Seconds\n", delta.stream().mapToDouble(x -> x).average().getAsDouble());
    }

    public static void streamVsForTest(int n) {
        long start1, start2, end1, end2;

        List<Long> delta = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            start1 = System.currentTimeMillis();
            IntStream.range(0, 10000).forEach(x -> list1.add(x));
            end1 = System.currentTimeMillis();

            start2 = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                list2.add(i);
            }
            end2 = System.currentTimeMillis();

            delta.add((end1 - start1) - (end2 - start2));
        }
        System.out.println("mean delta: " + delta.stream().mapToLong(x -> x).average().getAsDouble());
    }

    // endregion
}
