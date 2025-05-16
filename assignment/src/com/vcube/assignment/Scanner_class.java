package com.vcube.assignment;
import java.util.Scanner;
public class Scanner_class {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello this is  scanners main method started ");
             Scanner sc=new Scanner(System.in);
             String hello="hi";
             System.out.println("enter id");
             int id=sc.nextInt();
             
             System.out.println("enter name");
             sc.nextLine();
             String name=sc.nextLine();
             System.out.println("enter age");
             int age=sc.nextInt();
             System.out.println("enter rollno");
             int roll_no=sc.nextInt();
//             System.out.println("enter id");
             Scanner_class sc_Obj=new Scanner_class();
             
             sc_Obj.details(id, name, age, roll_no,sc);
             
             
	}

	void details(int ivd,String name, int age, int roll_no, Scanner sc) {
		
	System.out.println("enter  phone no")	;
	int phone_No = sc.nextInt();
	System.out.println(" \nid "+ivd);
	System.out.println("name "+name);
	System.out.println("age "+age);
	System.out.println("roll_no "+roll_no);
	System.out.println(phone_No);
//	System.out.println(hello);
	}
}
