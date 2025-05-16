package com.vcube.datatype;

//import java.lang.management.GarbageCollectorMXBean;

public class DataTypes {
static int g;
	static{
	System.out.println("hello stati");
	
	}
	static byte a = 123;
	static short n = (short) 12345555;
	static int n1 = 15565;
	static long l = 12116166161616l;
	static float f = 200899888800000000002.5f;
//	static double d = 25161516.5555;
	static char c;
	
	char d='h';

	public static void main(String[]         args) {
		// TODO Auto-generated method stub
		int d=1;
		
		System.out.println(a);
		System.out.println(n);
		System.out.println(n1);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(new DataTypes().d);
		System.out.println(g);
		
//		 =new DataTypes();
	}

}
