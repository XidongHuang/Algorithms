package com.tony.testAlgorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

public class testAlgorithms {

	

	/*
	 * Given an array of numbers nums, in which exactly two elements appear only
	 * once and all the other elements appear exactly twice. Find the two
	 * elements that appear only once.
	 * 
	 * For example:
	 * 
	 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
	 * 
	 * Note: The order of the result is not important. So in the above example,
	 * [5, 3] is also correct. Your algorithm should run in linear runtime
	 * complexity. Could you implement it using only constant space complexity?
	 * 
	 * 
	 * 
	 */

	@Test
	public void testSingleNumberIII() {

		int[] nums = { -1, 1, 2, 2, 5, 6 };

		int[] h = singleNumber(nums);

		for (int o : h) {
			System.out.println(o);
		}

	}

	public int[] singleNumber(int[] nums) {

		List<Integer> list = new ArrayList<>();
		List<Integer> compare = new ArrayList<>();
		int[] answer = null;

		for (int num : nums) {
			System.out.println(num);

			if (list.contains(num)) {
				compare.add(num);
			} else {
				list.add(num);
			}

		}
		System.out.println(compare);
		System.out.println(list);

		if (!compare.isEmpty()) {

			for (Integer c : compare) {

				list.remove(c);
			}

		}
		System.out.println(list);

		if (!list.isEmpty()) {
			int size = list.size();
			answer = new int[size];
			for (int i = 0; i < size; i++) {
				answer[i] = list.get(i);

			}
		}

		return answer;
	}

	/*
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements.
	 * 
	 * For example, given nums = [0, 1, 0, 3, 12], after calling your function,
	 * nums should be [1, 3, 12, 0, 0].
	 * 
	 * Note: You must do this in-place without making a copy of the array.
	 * Minimize the total number of operations.
	 * 
	 * 
	 */
	@Test
	public void testMoveZeros() {

		int[] nums = { 0, 0, 0, 0, 0, 0 };

		moveZeros2(nums);

	}

	public void moveZeros2(int[] nums) {

		int index = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;

			}

		}

		if (index != 0) {

			for (int k = index; k < nums.length; k++) {

				nums[k] = 0;

			}

		}

		for (int num : nums) {
			System.out.println(num);
		}

	}

	public void moveZeros(int[] nums) {

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {

				queue.add(nums[i]);

			}

		}

		for (int k = 0; k < nums.length; k++) {

			if (!queue.isEmpty()) {
				nums[k] = queue.poll();

			} else {
				nums[k] = 0;

			}

		}

		for (int num : nums) {

			System.out.println(num);
		}

	}

	/*
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit.
	 * 
	 * For example:
	 * 
	 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has
	 * only one digit, return it.
	 * 
	 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
	 * 
	 */
	@Test
	public void testAddDigits() {

		int sum = addDigits(1998);
		System.out.println(sum);

	}

	public int addDigits(int num) {

		String numStr = Integer.toString(num);
		int sum = 0;

		if (numStr.length() == 1) {
			return num;
		}

		for (int i = 0; i < numStr.length(); i++) {

			sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));

		}

		int an = addDigits(sum);

		return an;

		// if(numStr.length() == 1){
		// return Integer.parseInt(numStr);
		// }
		//
		// while (numStr.length() > 1) {
		// for (int i = 0; i < numStr.length(); i++) {
		//
		// tem += Integer.parseInt(String.valueOf(numStr.charAt(i)));
		//
		// }
		// sum = addDigits(tem);
		// }
		//
		// return sum;
	}

}
