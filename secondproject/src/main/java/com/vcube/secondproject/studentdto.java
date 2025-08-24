package com.vcube.secondproject;

public class studentdto {
	int id;
	String name;
	int age;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public studentdto(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public studentdto( String name, int age) {
		super();
//		this.id = id;
		this.name = name;
		this.age = age;
	}

	

}
