package com.alexandrSinko.ModuleOne.Solution1;

// ProfiTsoft, task 1.
// takes an array of integers as input,
// and returns only those numbers that are positive (>=0),
// sort them in descending order.

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        getPositiveSortedNumbers(new int[] {-7,-2,-3,0,5,3,2,1});
    }

    public static int[] getPositiveSortedNumbers(int[] arrayOfNumbers) {
        return Arrays.stream(arrayOfNumbers)
                .filter(n -> n >= 0)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}


