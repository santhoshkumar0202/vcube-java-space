package com.vcube.assignment;

import java.util.Scanner;

public class VotingSystem18_06_25 {

	public static void main(String[] args) throws CustomException  {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age");
		int age=sc.nextInt();
		try {
			if(age<18) {
				 throw new CustomException("you are not eligible for voting since you are below age limit");
			}else {
				System.out.println("you are eligible for voting ");
			}
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("main method ended");
	}

}

 class CustomException extends Exception{
	String detailMessage="kin khan";
	public CustomException(String s){
	
		detailMessage=s;
	}
}