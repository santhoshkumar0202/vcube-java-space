package com.vcube.arrays;

public class LongestIncreaingSubArr {

	public static void main(String[] args) {
		int current_len = 1;
		int max_len = 0;
		int index = 0;
		int arr[] = { 1, 2, 3, 4, 2, 3, 4 };
		for (int i = 0; i < arr.length - 1; i++) {

			// here also we can use i=1 and arr[i]>arr[i-1]
			if (arr[i] < arr[i + 1]) {
				current_len++;
				if (current_len > max_len) {
					// if we use index i it doesn't specify the last index it specifies but one so
					// we are taking i+1
					index = i + 1;
					max_len = current_len;
//2 3 
				}
			} else {
				current_len = 1;
			}

		}
		System.out.println(index);
		System.out.println(max_len);
		for (int i = index - max_len + 1; i <= index; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
