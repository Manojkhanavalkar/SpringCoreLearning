package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/alone_config.xml");
		Person person1=context.getBean("person1",Person.class);//by using Person.class we can avoid the typecasting we need to do
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());//by this we can find out what kind of collection
		//class has been used hear
		System.out.println("+++++++++++++++++");
		System.out.println(person1.getFeeStructure());
		System.out.println("+++++++++++++++++");
		System.out.println(person1.getProperties());
	}

}
