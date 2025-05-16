package com.Vcubeforloop;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("please enter the number to find the even numbers up to given number is even or not ");
//		int even_no = sc.nextInt();
//		evenNumber(even_no);
//		System.out.println("please enter the number to find out the factors of given number ");
//		int factor_no = sc.nextInt();
//		factors(factor_no);
//		System.out.println("Please enter the number to check the whether the given number is perfecct or not ");
//		int perfect_no = sc.nextInt();
//		perfect(perfect_no);
		
		
		
		
//		System.out.println("Please enter the number to check the whether the given number is perfecct or not ");
//	int fab_no = sc.nextInt();
//		
//		fabnoccies(fab_no);
		
		factorial(4);
		System.out.println("Factorial by using recursive method : "+recursive_factorial(4));
	}

	static public void evenNumber(int n) {

		System.out.println("\nThese are the even number for provided number");
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println("321");
		System.out.println();

	}

	static public void factors(int n) {

		/*
		 * factor number:- a divisor of an integer also called a factor of is an integer
		 * that may be multiplied by some integer to produce In this case
		 */
		System.err.println("\nfactors of " + n + " are");

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
		System.out.println();
	}

	static public void perfect(int num) {
		/*
		 * perfect number is a number which sum of divisors of the given number equals
		 * to actual given number then it said to be a perfect number
		 */int sum = 0;
		 System.out.println("Divisors of the given number "+(num) +" are :");

		for (int i = 1; i <= num / 2; i++) {
			
			if (num   %   i == 0)    {
				System.out.print(i + " \n");
				sum = sum + i;
			}

		
		}
		
		if (num == sum) {
			System.out.println("The given number is perfect since the sum is eqaul to given number \nsum : "+sum+"\ngiven number is : "+ num);
		} else {
			System.out.println("The given number is not perfect since the sum is not eqaul to given number \nsum : "+sum+"\ngiven number is : "+ num);
		}
	}

   static public void fabnoccies(int n) {
	   int n1=0; // 0 1 1
	   int n2=1;// 1 1  2
	   int n3=0;//1  2  
	   System.out.print("0 1");
	   for (int i = 0; i < n; i++) {
		   n3=n1+n2;
		System.out.print(" "+n3);
		
		n1=n2;
		n2=n3;
		
	}
	   
	   
	   
	   
   }

static public void factorial(int n) {
	int fact=1;
	 for (int i = 1; i <=n; i++) {
		 // 3*1=3  3*2=6 6*3 
		fact=fact * i;
	}
	 //if 4*4 answer will be 16
	 System.out.print("Factorial for "+n+":"+(fact)+"\n");
	 
	
	
}

static public int recursive_factorial(int n) {
	
	if(n==0) {return 1;};
	
	return n*recursive_factorial(n-1);
}
}