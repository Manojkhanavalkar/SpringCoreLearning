package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

 //@ComponentScan(basePackages = "com.springcore.javaconfig") this is used to @component 
//method in student class here 
@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","laila","Majnu","temp"})
	public Student getStudent() {
		Student std=new Student(getSamosa());
		return std;
	}
}
