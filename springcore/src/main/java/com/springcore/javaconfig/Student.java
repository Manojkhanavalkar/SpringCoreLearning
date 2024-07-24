package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;

//@Component is used to act to create object
public class Student {
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book!!");
	}
}
