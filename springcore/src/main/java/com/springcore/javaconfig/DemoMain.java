package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=context.getBean("temp",Student.class);
		System.out.println(student);
		student.study();
		Samosa samosa=context.getBean("getSamosa",Samosa.class);
		System.out.println("####### Calling display method seperatly using the bean of samosa #######");
		samosa.display();

	}

}
