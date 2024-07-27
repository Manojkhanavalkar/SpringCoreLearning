package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 //@ComponentScan(basePackages = "com.springcore.javaconfig") this is used to @component 
//method in student class here ...it is used when we are not using @Bean annotation
@Configuration //used to declare this class as the configuration class
public class JavaConfig {
	
	@Bean //used to create a bean 
	public Samosa getSamosa() {//now this getSamosa is id by which we are going to get bean in main class
		return new Samosa();
	}
	
	@Bean(name = {"student","laila","Majnu","temp"})//we can also "getbean" by using different array of names mentioned here
	public Student getStudent() {
		Student std=new Student(getSamosa());//dependency injection is done here i.e the Student 
		//class here is dependent on the Samosa class
		//###we are creating object of student class here
		return std;
	}
}
