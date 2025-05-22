package com.vcube.arrays;

import java.util.Arrays;

public class ArrayConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 4, 3 };
		int[] b = { 1, 2, 3 };
		int[] c = { 10, 20, 30 };
		// concat 2 arr
		conc(a, b);
		// concat 3 arrs
		conc(a, b, c);

	}
// concate method for 2 arrays
	static void conc(int[] a, int[] b) {

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}
		System.out.println(Arrays.toString(c));

	}

	static void conc(int[] a, int[] b, int[] c) {

		int[] d = new int[a.length + b.length + c.length];

		for (int i = 0; i < a.length; i++) {
			d[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			d[a.length + i] = b[i];
		}
		for (int i = 0; i < b.length; i++) {
			d[a.length + b.length + i] = b[i];
		}
		System.out.println(Arrays.toString(d));

	}
}
