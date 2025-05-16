package com.vcube.assignment;

public class Assignment_01_05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=6;
		 //swapping variable using arthematic 
		 a=a+b;//11
		 b=a-b;
	     a=a-b;	 
	     
	     //swapping variable using xor operator 
	     int c=1;
	     int d=3;
	     
	     c=c^d;
	     d=c^d;
	     c=c^d;
	        
	        System.out.println("result a:"+a+" b:"+b);
	        System.out.println("result c:"+c+" d:"+d);
		
		
	}

}
