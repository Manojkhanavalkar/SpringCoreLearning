package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("obj")
//@Scope("prototype")
public class Student {
	@Value("Manoj")
	private String studentName;
	@Value("Pune")
	private String city;
	//now to insert value in collection first need
	//create a stand alone collection in xml file
	@Value("#{tempAddress}")//by using id of stand alone collection we are getting it
	private List<String>address;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
