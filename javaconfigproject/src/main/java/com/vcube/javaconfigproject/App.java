package com.vcube.javaconfigproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// spring conatiner #1
		ApplicationContext ap = new AnnotationConfigApplicationContext(studentconfig.class);

		// spring conatiner #2
		ApplicationContext ap1 = new AnnotationConfigApplicationContext(studentconfig.class);
		Studentdto s1 = (Studentdto) ap1.getBean("gt");
		// both of them are singleton will be created only once

		Studentdto s = (Studentdto) ap.getBean("gt");
		Studentdto s2 = (Studentdto) ap.getBean("gt");
		s.show();
		s1.show();
	}
}
