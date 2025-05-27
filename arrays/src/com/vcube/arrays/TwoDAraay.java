package com.vcube.arrays;

import java.util.Arrays;

public class TwoDAraay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3D Array

		int[][][] threeD = new int[2][2][2];

		threeD[0][0][0] = 1;
		threeD[0][0][1] = 2;

		threeD[0][1][0] = 3;
		threeD[0][1][1] = 4;

		threeD[1][0][0] = 5;
		threeD[1][0][1] = 6;

		threeD[1][1][0] = 7;
		threeD[1][1][1] = 8;

		// 2D Array
		int[][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 5;
//		arr[2][1];
		String[][] matrix = { { "kiran", "suresh", "nagesh" }, { "kukesh", "jakesh" } };

//		arr[0] = arr[1] = arr[2] = arr[3] = arr[4] = 1;

		System.out.println("3D Matrix");

		for (int[][] a : threeD) {
			for (int[] b : a) {
				for (int c : b) {
					System.out.print(c + " ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}

		System.out.println(Arrays.toString(arr));
		for (int[] a : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println(" ");
		}

		System.out.println("ForEah for Matrix");
		for (String[] strings : matrix) {
			for (String str : strings) {
				System.out.println(str + " ");
			}
			System.out.println(" ");
		}

		
		loop(threeD);
	}

	static void loop(int[][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("");
		}

	}
}
