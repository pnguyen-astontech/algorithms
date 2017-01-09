package com.company.recursion;

/**
 * Created by petenguy1 on 11/21/2016.
 *
 *      http://codingbat.com/prob/p185204
 *      Notes: Not finished
 *
 */
public class TwoEqualArrays {

    public static void main(String[] args) {
        System.out.println("test");
    }

    public static boolean splitArray(int[] nums) {

        if (nums.length == 2){
            return helper(nums[0], nums[1], 0, 0);
        } else {

        }

        return false;
    }

    public static boolean helper(int n1, int n2, int sum1, int sum2) {
        sum1 += n1;
        sum2 += n2;

        if (sum1 == sum2)
            return true;
        else
            return false;
    }
}
