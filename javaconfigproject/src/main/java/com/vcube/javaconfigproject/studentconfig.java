package com.vcube.javaconfigproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentconfig {
	
	
@Bean(name = "st")
	public Studentdto student() {
		return new Studentdto(25,"kiran",10);
	}
@Bean(name = "gt")
public Studentdto student1() {
	return new Studentdto(25,"kiranm",10);
}


{System.out.println("st obj created");}

}
