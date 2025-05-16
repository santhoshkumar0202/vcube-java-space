package com.vucbe.case_studies;

import java.util.Scanner;

public class StudentMarks {
	String name;
	int telugu, hindhi, english, physics, social, maths;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter name of student".toUpperCase());
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("enter telugu marks".toUpperCase());
		int tel = sc.nextInt();
		System.out.println("enter hindi marks".toUpperCase());
		int hin = sc.nextInt();
		System.out.println("enter english marks".toUpperCase());
		int eng = sc.nextInt();
		System.out.println("enter physics marks".toUpperCase());
		int phy = sc.nextInt();
		System.out.println("enter social marks".toUpperCase());
		int soc = sc.nextInt();
		System.out.println("enter maths marks".toUpperCase());
		int mat = sc.nextInt();

		StudentMarks student1 = new StudentMarks(name, tel, hin, eng, phy, soc, mat);

		var c = student1.result();
		System.out.println(c);

	}

	public StudentMarks(String name, int telugu, int hindhi, int english, int physics, int social, int maths) {

		this.name = name;
		this.telugu = telugu;
		this.hindhi = hindhi;
		this.english = english;
		this.physics = physics;
		this.social = social;
		this.maths = maths;

	}

	int sum() {

		int sum = telugu + hindhi + english + physics + social + maths;
		return sum;
	}

	double avg() {
		int sum = sum();
		return (sum / 6);
	}

	boolean result() {
		String result_state;
		boolean result = false;
		if (name != null && this.telugu >= 50 && this.hindhi >= 50 && this.maths >= 50 && this.physics >= 50
				&& this.english >= 50 && this.social >= 50) {

			Double avg = avg();
			result_state = (avg >= 50) ? "pass" : "fail";
			if (result_state == "pass") {

				result = true;
			} else {
				result = false;
			}

			System.out.println("result of the student in boolean value : " + result);
			System.out.println("student state: " + result_state);

		} else {
			System.out.println("failed in subjects");
		}
		return result;
	}

}
