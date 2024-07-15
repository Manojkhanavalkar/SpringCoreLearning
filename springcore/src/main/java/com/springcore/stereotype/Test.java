package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Test {

	public static void main(String[] args) {
		//Now we are going to get an object without using bean
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/config-sterotype.xml");
		//now to get a student class we need to actually write the object name in camel case
		//OR we need to give name in @Component("obj"). If we have given
		//this then if we use a bean in camel case then it will give an error
		Student student=con.getBean("obj",Student.class);
//	*****	System.out.println(student);//it will create object but if we have not given
		//the values by using the @Value  annotation 
		//Displaying the Collections present in student class
//	*****	System.out.println(student.getAddress());
//	*****	System.out.println(student.getAddress().getClass().getName());
		//now here we are going to learn the scope of bean
		//there are different scope of bean
		/*
		 * Singleton->creates object ones and gives reference another time hence
		 * the hascode is same
		 * prototype->creates diffrent object each time in memory
		 * request
		 * session
		 * globalsession
		 * */
		//to declare the scope of the bean we need to give annotation below the @Component("obj") like @Scope("singleton/prototype/request/session/globalsession")
		//this is while we are using the annotations
		System.out.println("Check the hashcodes below");
//		System.out.println("student="+student.hashCode());
		Student std=con.getBean("obj",Student.class);
//		System.out.println("std="+std.hashCode());
		Teacher t1=con.getBean("teacher",Teacher.class);
		Teacher t2=con.getBean("teacher",Teacher.class);
		//we are using the bean xml to prove the same scope concept of above
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
