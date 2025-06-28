package com.vcube.arrays;

public class EqulibriumTimeComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 2, 2 };

		int total_sum = 0;

		for (int i : arr) {
			total_sum += i;
		}
		System.out.println(total_sum);

		int left = 0;

		for (int i = 0; i < arr.length; i++) {
			int right = total_sum - left - arr[i];

			if (right == left) {
				System.out.println("found at: " + i + " index");
				return;
			} else {
				left += arr[i];
			}
		}

	}

}
