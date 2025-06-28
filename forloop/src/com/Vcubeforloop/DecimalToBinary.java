package com.Vcubeforloop;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the given number to convert decimal to binary");

		String binary = "";
		int decimal = sc.nextInt();// 25
		int r = 0;

		while (decimal > 0) {
			if (decimal == 0) {

				binary = "0";
			}

			r = decimal % 2;
			binary = r + binary;// 11001
			decimal = decimal / 2; // 12,6,3,

		}

		System.out.println("The converted binary number is : " + binary);

	}

}
