package com.vcube.arrays;

public class DuplicateArraysAndUniqueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 23, 5, 78, 3, 9, 50, 10,23, 9, 3 };
		boolean present = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					present = true;
					break;
				} else {
					present = false;
				}

			}
			
			
			if (present) {
				System.out.print(arr[i] + " ");
			}

		}
//			System.out.print(arr[i] + " ");

	}

}
