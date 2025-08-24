package spri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

Studentdto st=(Studentdto)context.getBean("std");

System.out.println(st.getStd_id());
System.out.println(st.getStd_name());
	}

}
