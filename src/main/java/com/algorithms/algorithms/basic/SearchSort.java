package com.algorithms.algorithms.basic;

public class SearchSort {

    // find the index of a number in array
    public static int binarySearch(int[] arr, int x)  {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int low, int high, int x)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearchRecursive(arr, low, mid - 1, x);
            }
            return binarySearchRecursive(arr, mid + 1, high, x);
        }
        return -1;
    }
}
