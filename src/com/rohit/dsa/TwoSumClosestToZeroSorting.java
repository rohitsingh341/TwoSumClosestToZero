package com.rohit.dsa;

import java.util.Arrays;

/**
 * Time Complexity - O(nlogn)
 * Space Complexity - O(1)
 */
public class TwoSumClosestToZeroSorting {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-2,3,5,2,6};
        int [] twoInts = findSumClosestToZero(arr);
        System.out.println("Two sum -> " + Arrays.toString(twoInts));
    }

    private static int[] findSumClosestToZero(int[] arr) {
        if (arr.length < 2) {
            return new int [] {-1, -1};
        }
        Arrays.sort(arr);

        int sumClosestToZero = Integer.MAX_VALUE;
        int idxOne = 0;
        int idxTwo = 0;

        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while ( leftPointer < rightPointer) {
            int sum = arr[leftPointer] + arr[rightPointer];

            if (Math.abs(sum) < Math.abs(sumClosestToZero)) {
                sumClosestToZero = sum;
                idxOne = leftPointer;
                idxTwo = rightPointer;
            }

            if (sum < 0) {
                leftPointer++;
            }
            else {
                rightPointer--;
            }
        }

        return new int [] {arr[idxOne], arr[idxTwo]};
    }
}
