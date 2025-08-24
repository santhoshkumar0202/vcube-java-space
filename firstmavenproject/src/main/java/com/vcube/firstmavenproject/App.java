package com.vcube.firstmavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      studentdto st=(studentdto)context.getBean("fr");
      
      System.out.println(st.getSt_id());
      System.out.println(st.getSt_name());
    }
}
