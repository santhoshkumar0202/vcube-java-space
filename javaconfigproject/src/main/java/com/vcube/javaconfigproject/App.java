package com.vcube.javaconfigproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext ap = new AnnotationConfigApplicationContext(studentconfig.class);
		Studentdto s = (Studentdto) ap.getBean("st");
		s.show();
	}
}
