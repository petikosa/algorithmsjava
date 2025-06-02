package com.algorithms.algorithms.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayAlgos {

    // find indexes of two numbers which sum to target
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }

    // find the maximum difference (profit) between a stock bought earlier and the one bought later
    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    // find the subarray with the maximal sum
    public static int maxSubarray(int[] numbers) {
        int bestSum = numbers[0];
        int currentSum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            currentSum = Math.max(currentSum + numbers[i], numbers[i]);
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }

    // merge overlapping 2-array intervals
    public static int[][] mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; ++i) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            int[] lastMergedInterval = mergedIntervals.getLast();

            if (lastMergedInterval[1] < start) {
                mergedIntervals.add(intervals[i]);
            } else {
                lastMergedInterval[1] = Math.max(lastMergedInterval[1], end);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
