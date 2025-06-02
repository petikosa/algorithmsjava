package com.algorithms.algorithms;

import com.algorithms.algorithms.basic.ArrayAlgos;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ArraysTests {

	@Test
	void twoSumExists() {
		// given
		int[] arr = new int[]{5, 8, 2, 1, 9, -2};
		int target = 6;

		// when
		int[] result = ArrayAlgos.twoSum(arr, target);

		// then
		assertThat(java.util.Arrays.equals(result, new int[]{0, 3})).isTrue();
	}

	@Test
	void twoSumDoesNotExist() {
		// given
		int[] arr = new int[]{5, 8, 2, 1, 9, -2};
		int target = 4;

		// when
		int[] result = ArrayAlgos.twoSum(arr, target);

		// then
		assertThat(java.util.Arrays.equals(result, new int[]{})).isTrue();
	}

	@Test
	void profitExists() {
		// given
		int[] stockPrices = new int[]{2, 1, 3, 9, 5, 7};

		// when
		int result = ArrayAlgos.maxProfit(stockPrices);

		// then
		assertThat(result).isEqualTo(8);
	}

	@Test
	void noProfitExistsInDescendingOrder() {
		// given
		int[] stockPrices = new int[]{8, 5, 3, 2, 1};

		// when
		int result = ArrayAlgos.maxProfit(stockPrices);

		// then
		assertThat(result).isEqualTo(0);
	}

	@Test
	void findSubarrayWithMaximumSumAllNumbers() {
		// given
		int[] numbers = new int[]{1, 2, 7, 3, 2, 8, 4, 2};

		// when
		int result = ArrayAlgos.maxSubarray(numbers);

		// then
		assertThat(result).isEqualTo(java.util.Arrays.stream(numbers).sum());
	}

	@Test
	void findSubarrayWithMaximumSumLastFiveNumbers() {
		// given
		int[] numbers = new int[]{1, 2, -7, 3, 2, 8, 4, 2};

		// when
		int result = ArrayAlgos.maxSubarray(numbers);

		// then
		assertThat(result).isEqualTo(19);
	}

	@Test
	void mergeIntervals() {
		// given
		int[][] intervals = {{5, 7}, {1, 3},{3, 4}, {2, 6}};

		// when
		int[][] result = ArrayAlgos.mergeIntervals(intervals);

		// then
		assertThat(Arrays.deepEquals(result, new int[][]{{1, 7}})).isTrue();
	}

}
