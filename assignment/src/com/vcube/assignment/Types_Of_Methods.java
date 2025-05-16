package com.vcube.assignment;



import java.util.Scanner;

public class Types_Of_Methods {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(bool());

System.out.println(add()+bool());
	}

static String	bool() {
	System.out.println("hello please enter the bool value which you have in your mind");
	boolean b =sc.nextBoolean();
	boolean b1 =sc.nextBoolean();
	String sum=b+""+b1; // we cant concatinate bloolean with any type it retun compilke time error operator is undefined for char
	//we can achieve this with the  b+" "+b1
	return sum;
}
static int	add() {
	System.out.println("hello please enter the add value which you have in your mind,   add");
	int b =sc.nextInt();
	int b1 =sc.nextInt();
	int sum=b+b1;
	return sum;
}
	
}
