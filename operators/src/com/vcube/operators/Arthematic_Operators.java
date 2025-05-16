package com.vcube.operators;

import java.security.PrivateKey;
import java.util.Scanner;

public class Arthematic_Operators{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scw= new Scanner(System.in);
int  a =scw.nextInt();
int b =scw.nextInt();

// behind this mechanism it store in the new string() obj pointing to differ
// for priority it follows bodmos rule
String s1= scw.next();

String s2= scw.next(); 
String s3="hello"; 
String s4="hello"; 
scw.close();
System.out.println(s1==s2);// 
System.out.println(s3==s4);// 
System.out.println("priniting the result "+a+b);
System.out.println("priniting the result "+(a-b));
System.out.println("priniting the result "+ a/b);
System.out.println("priniting the result "+ a*b);
System.out.println("priniting the result "+ (a*b));
System.out.println("priniting the result "+ a%b);

	}

}
