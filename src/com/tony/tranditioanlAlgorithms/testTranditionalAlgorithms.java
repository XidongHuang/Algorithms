
package com.tony.tranditioanlAlgorithms;

import org.junit.Test;

public class testTranditionalAlgorithms {

	/**
	 * Insertion sort:
	 * Best case: O(n)
	 * Worst case: O(n^2)
	 * Average case: O(n^2)
	 * 
	 * 
	 * It is impractical for large amount of numbers, however, it is the fastest sorting method
	 * for small size number array. Even for quick sort, in the small size array, it still uses
	 * Insertion sort.
	 * 
	 */
	@Test
	public void testInsertionSort() {

		int[] nums = { 5, 2, 4, 6, 1, 3, 7, 2 };
		nums = insertionSort(nums);

		for (int i : nums) {
			System.out.println(i);
		}

	}

	public int[] insertionSort(int[] nums) {

		int key;
		int o;

		if (nums != null) {

			for (int i = 1; i < nums.length; i++) {

				key = nums[i];
				o = i - 1;
				while (o >= 0 && nums[o] > key) {
					nums[o + 1] = nums[o];
					o = o - 1;

				}
				nums[o + 1] = key;

			}

		}

		return nums;

	}

}
