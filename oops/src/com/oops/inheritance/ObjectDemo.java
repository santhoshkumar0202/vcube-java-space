package com.oops.inheritance;

// paraent class
class ObjectDemo2 {
	String name = "kya from demo2 23" + this.name;

	ObjectDemo2() {
		System.out.println("no arg demo2 has been called");
	}

	ObjectDemo2(String name) {
		System.out.println("para demo2 has been called");
		this.name = name;
	}
}

//child class
public class ObjectDemo extends ObjectDemo2 implements Cloneable {
	String name = "kya naam hai tera ?";

	ObjectDemo() {
		System.out.println("no arg demo has been called");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalze has been called");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("main method started");

		ObjectDemo obj = new ObjectDemo();
		ObjectDemo a = (ObjectDemo) obj.clone();
		ObjectDemo2 obj2 = new ObjectDemo2();
		System.out.println("*********obj3********");
		// updacasting
		ObjectDemo2 obj3 = new ObjectDemo();
		System.out.println("*********obj3-get class*********");
		System.out.println(obj3.getClass());
		System.out.println("*********obj3-without get class*********");
		System.out.println(obj3);
		System.out.println("*********obj3-hashcode obj*********");
		System.out.println(obj3.hashCode());
		System.out.println("*********obj3-tostring obj*********");
		System.out.println(obj3.toString());
		System.out.println("check****************");
System.out.println(obj);
System.out.println(obj);
		obj3 = new ObjectDemo2("kani");
		System.out.println(obj3.name);

		new ObjectDemo();
//		System.gc();

		obj = null;
//		System.gc();

//		System.gc();
		System.out.println(a.name);
		System.out.println("hello");
		System.out.println("obj****name");
		System.out.println(obj3.name);

		System.gc();
//		a = obj;

		System.out.println(obj3.name);
	}

}
