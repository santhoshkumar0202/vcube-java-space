package com.vcube.secondproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		studentdto st=(studentdto) context.getBean("st");
//		studentdto st=(studentdto) context.getBean("st");
		System.out.println(st.getName());

	}
}
