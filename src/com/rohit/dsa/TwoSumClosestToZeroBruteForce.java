package com.rohit.dsa;

import java.util.Arrays;

public class TwoSumClosestToZeroBruteForce {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-2,3,5,2,6};
        int [] twoInts = findSumClosestToZero(arr);
        System.out.println("Two sum -> " + Arrays.toString(twoInts));
    }

    private static int[] findSumClosestToZero(int[] arr) {

        if (arr.length < 2) {
            return new int [] {-1, -1};
        }
        //assume first two elements' sum is closest to zero
        int sumClosestToZero = arr[0] + arr[1];
        int idxOne = 0;
        int idxTwo = 0;
        for (int i =0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(sumClosestToZero)) {
                    idxOne = i;
                    idxTwo = j;
                    sumClosestToZero = sum;
                }
            }
        }
        return new int [] {idxOne, idxTwo};
    }
}
