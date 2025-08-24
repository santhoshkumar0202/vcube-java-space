package com.vcube.javaconfigproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class studentconfig {
@Bean(name = "st")
	public Studentdto student() {
		return new Studentdto();
	}
}
