package com.vcube.assignment;

//import java.util.Iterator;

public class Assignment_01_05_25_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var a = 0;
		int n = 10;

		for (int i = 0; i < n; i++) {
			if (i > 0) {
			 break;
			}
			n +=n;

		}
		System.out.println(n);
	shif();	
	}
	
static	void shif() {
		int a=20;
		int result =a<<1;
		System.out.println(result);
	}
	
	
}
