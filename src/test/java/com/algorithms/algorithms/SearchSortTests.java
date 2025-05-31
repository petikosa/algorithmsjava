package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.SearchSort;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SearchSortTests {

    @Test
    void testBinarySearch() {
        // given
        int[] arr = {1, 4, 5, 6, 8, 10, 17};
        int x = 4;

        // when
        int result1 = SearchSort.binarySearch(arr, x);
        int result2 = SearchSort.binarySearchRecursive(arr, 0, arr.length - 1, x);

        // then
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(1);
    }

    @Test
    void testBinarySearchEmptyArray() {
        // given
        int[] arr = {};
        int x = 4;

        // when
        int result1 = SearchSort.binarySearch(arr, x);
        int result2 = SearchSort.binarySearchRecursive(arr, 0, arr.length - 1, x);

        // then
        assertThat(result1).isEqualTo(-1);
        assertThat(result2).isEqualTo(-1);
    }
}
