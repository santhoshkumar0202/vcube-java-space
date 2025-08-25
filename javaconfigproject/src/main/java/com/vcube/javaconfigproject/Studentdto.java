package com.vcube.javaconfigproject;

import org.springframework.beans.factory.annotation.Value;

public class Studentdto {
//	@Value("10")
int id;
public Studentdto(int id, String name, int age) {
	super();
	
	this.id = id;
	this.name = name;
	this.age = age;
}
//@Value("sanmhihs")
String name;
//@Value("25")
int age;

public Studentdto() {}

void show() {
	System.out.println("id:"+id+" name:"+name+" age:"+age);
	System.out.println("hascode: "+this.hashCode());
}
}
