package com.algorithms;

/* Finding the sum of contiguous subarray within a one-dimensional
 array of numbers which has the largest sum.*/

public class LargestSumContigousArray {

	private static int maxSubArraySum(int[] a) {

		int max_current = a[0], max_global = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max_current + a[i])
				max_current = a[i];
			else
				max_current = a[i] + max_current;
			if (max_global < max_current) {
				max_global = max_current;
			}
		}
		return max_global;
	}

	public static void main(String[] args) {
		int[] a = { 5, -8, 8, -1, -3 };
		System.out.println("Maximum contiguous array sum is " + maxSubArraySum(a));

	}
}

