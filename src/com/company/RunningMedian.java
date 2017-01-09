package com.company;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by petenguy1 on 12/9/2016.
 *
 *
 *      https://www.hackerrank.com/challenges/find-the-running-median
 */
public class RunningMedian {

    private static int streamLength;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Heap maxHeap = new Heap("MAX");
        Heap minHeap = new Heap("MIN");
        int number;
        int maxSize;
        int minSize;

        streamLength = scanner.nextInt();
        double median = scanner.nextInt();
        maxHeap.put((int) median);
        System.out.println(median);
        for (int i = 0; i < streamLength-1; i++){
            number = scanner.nextInt();
            if (number > median) {
                minHeap.put(number);
            } else {
                maxHeap.put(number);
            }

            maxSize = maxHeap.getSize();
            minSize = minHeap.getSize();

            if (maxSize-minSize == 2) {
                minHeap.put(maxHeap.popRoot());
            } else if (minSize-maxSize == 2) {
                maxHeap.put(minHeap.popRoot());
            }

            maxSize = maxHeap.getSize();
            minSize = minHeap.getSize();

            if (maxSize == minSize) {
                median = (maxHeap.peekRoot() + minHeap.peekRoot()) / 2.0;
            } else if (maxSize < minSize) {
                median = (double) minHeap.peekRoot();
            } else {
                median = (double) maxHeap.peekRoot();
            }
            System.out.println(median);
        }
    }

}
