package com.vcube.literals;

public class Literals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		
		
   float f=201; // 201.0 conversion
		double f1=123f; //123.0 //double or float it is valid and return 123.0
//		float f2=123.0;// error (compilation)
		float f3=123.5f;//123.5f
		float f4=0123.0f;// if we specify F or f 123. of eliminating initial 0
		float f5=0x123; //invalid hex literal (compiler error) even if specify f after .0 value it is invalid unlike octal
		float f6=0123; // 83.0 octal conversion
		float f7=0123.5f; //123 
	 float f8=1230.f; // 1230.0
		float f9=0123f; // 123.0
		double f10=0x123d ; // some number 291.0 it works even if we specify double or float it gives the same value
   
   System.out.println("f "+f);
   System.out.println("f1 "+f1);
//   System.out.println(f2);
   System.out.println("f3 "+f3);
   System.out.println("f4 "+f4);
   System.out.println("f5 " +f5);
   System.out.println("f6 "+f6);
   System.out.println("f7 "+f7);
   System.out.println(f8);
   System.out.println(f9);
   System.out.println(f10);
	}

}
