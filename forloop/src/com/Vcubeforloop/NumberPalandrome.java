package com.Vcubeforloop;

import java.util.Scanner;

public class NumberPalandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the given number to find the given number is palandrome or not");
		int r = 0;
		int reversed_num = 0;
		int number = sc.nextInt();
		int original_num = number;
		while (number > 0) {
			r = number % 10;
			reversed_num = reversed_num * 10 + r;
			number = number / 10;
		}

		if (original_num == reversed_num) {
			System.out.println("The given number "+original_num+" is palandrome");
		} else {
			System.out.println("The given number "+original_num+"  is not palandrome");
		}
		sc.close();
	}

}
