package com.Vcubeforloop;

import java.util.Scanner;
// prime number program

// prime number are numbers which are divisible by 1 and it self called or known as a prime numbers
public class Primenumber {

	static boolean isprime(int n) {
		Boolean flage = true;
		for (int i = 2; i < n; i++) {

			if (i == 0 || i == 1) {
				flage = false;

			} else if (n % i == 0) {

				flage = false;
				break;

			}

		}
		return flage;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range of prime numbers");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {

			if (isprime(i)) {

				System.out.println(i);

			}

		}
		sc.close();
	}

}
