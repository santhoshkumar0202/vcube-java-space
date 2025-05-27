package com.vcube.arrays;

import java.util.Arrays;

public class Sumoftwoarrys {
int age=25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 4, 3, 20 };
		int[] b = { 1, 2, 10, 30 }; 
//		System.out.println(Arrays.toString(sumOfArrys(a, b)));
		
//		System.out.println(new Sumoftwoarrys().sumOfArrys(a, b);
	}

	public static int[] sumOfArrys(int[] a, int[] b) {
		// for handling exception
		if (a.length != b.length) {
			System.out.println("both arr a and arr b is not eqals in length");
			throw new Error("Length Miss Match");
		}
		int[] result = new int[a.length];
//		int[] result = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			result[i] = a[i] + b[i];
		}
		return result;
	}

}
