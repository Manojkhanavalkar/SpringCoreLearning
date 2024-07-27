package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;

//@Component is used to act to create object
public class Student {
	private Samosa samosa;//we are creating the Student class object dependent on  samosa
	//i.e in Student class we are now creating the object of Samosa class
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public Student(Samosa samosa) {//Constructor injection is used here 
		//what we used to do in xml was to give ref attribute in property tag ###now go to this mark in JavaConfig.java
		super();
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();//we are calling display method of the samosa class
		System.out.println("Student is reading book!!");
	}
}
