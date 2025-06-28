package com.vcube.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayEvenOddDia {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
//		int[][] matrix = new int[3][3];
//
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
//		for (int[] a : matrix) {
//			for (int b :a ) {
//			System.out.print(b);	
//			}
//		}

		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matrix2.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < matrix2.length / 2; j++) {

					int temp = matrix2[i][j];
//					System.out.println("con " + temp);

					matrix2[i][j] = matrix2[i][matrix2[i].length - 1 - j];

					matrix2[i][matrix2[i].length - 1 - j] = temp;
                     
				}
			}
		}
		
		for (int i = 0; i < matrix2.length; i++) {
			
				for (int j = 0; j < matrix2.length; j++) {
					if(i==j) {
						matrix2[i][j]= matrix2[i][j]*matrix2[i][j];
					
					
					
				}
			}
		}
		

		for (int[] a : matrix2) {
			System.out.println();
			for (int b : a) {
				System.out.print(b + " ");
			}
		}

	}

}
