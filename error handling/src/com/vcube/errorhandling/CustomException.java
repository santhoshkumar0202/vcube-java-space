package com.vcube.errorhandling;

public class CustomException extends Throwable {

	CustomException() {
		System.out.println("custom called");
	}

	CustomException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {

		CustomException c = new CustomException("msg123");
		System.err.println(c.getMessage());
		c.printStackTrace();

	}
}

class custom2 extends CustomException {
	int x = 2;

	public custom2() {
		System.out.println("cust 2 called");
		// TODO Auto-generated constructor stub
	}

	public custom2(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class custom3 extends custom2 {
	int x = 3;

	public custom3() {
		// TODO Auto-generated constructor stub
		System.out.println("called");
	}

	public custom3(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

class plain {

	public static void main(String[] args) throws CustomException {
		try {
			throw new custom3("have to fill all the fields");

		} catch (custom3 e) {
			// TODO: handle exception
			System.err.println(e);
			System.out.println("hello");
		} catch (custom2 e) {
			// TODO: handle exception
			System.out.println("hello2");
		} finally {
			System.out.println("finally");
		}
 // if we dont specify catch then for compiletime exceptions we need to use throws . for runtiime dont neeed
		try {
			throw new CustomException();
		} finally {
			// th: handle finally clause
		}
//	System.out.println(c.x);
//		System.out.println("jellp");

	}
}