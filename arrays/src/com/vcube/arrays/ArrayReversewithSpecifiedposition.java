package com.vcube.arrays;

import java.util.Iterator;
import java.util.Arrays;

public class ArrayReversewithSpecifiedposition {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 1, 10, 3, 7 };
		revese(3, arr);
	}

	static void revese(int s, int arr[]) {
		Integer a = s;
		int end = arr.length - 1;
		int start = (a == null) ? 0 : a;
		System.out.println(start);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sub reverse");
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		while (s < end) {

			int temp = arr[s];
			arr[s] = arr[end];
			arr[end] = temp;
			s++;
			end--;
		}
		System.out.print("subreverse:-");
		System.out.println(Arrays.toString(arr));
	}
}
