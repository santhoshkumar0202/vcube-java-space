package com.vcube.string;

public class Stringconstantpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub(scp)
		// below stores string constant pool
		String s1 = "Pavan";
		
// it creates two object one in pool if not present in pool and one in heap area
		String s3 = new String("pavan");

		System.out.println(s3.intern()==s1);
	}

}
