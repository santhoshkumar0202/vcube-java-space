package com.vcube.comandline;

public class Comandline {
// we use this command line arg for platform specific values which help to pass to the program 
protected  Comandline(){}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for (String ori_koti : args) {
	System.out.println("print ori koti values:- "+ori_koti);
}
	}

}
