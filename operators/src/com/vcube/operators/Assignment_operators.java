package com.vcube.operators;

import java.util.Scanner;

public class Assignment_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//note where if you int summ=5; int a=sum+2.0; it will throw error in this case
		// += compound operator will give 7 in this case 
		System.out.println("Assignment operators are =,+=,-=,*=,/=,%=");
		Scanner sc = new Scanner(System.in);
		System.out.println("give input for a variable");
		int a = sc.nextInt();

		System.out.println("give input for a variable");

		int b = sc.nextInt(); // = assignment operator ;

		System.out.println("a =" + a + "; b =" + b);
		System.out.println(a + b);
		a = 1000; // here we are reassiging
		System.out.println("a =" + a + "; b =" + b);
		b +=10;
		System.out.println("b =" + b);
		b*=10;
		System.out.println("b =" + b);
		int c = sc.nextInt(); // = assignment operator ;
		c%=3;
		System.out.println("b =" + c);
		int d = sc.nextInt(); // = assignment operator ;
		d/=3;
		System.out.println("b =" + d);
		
		

	}

}
