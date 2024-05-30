package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
	ApplicationContext context	=new ClassPathXmlApplicationContext("com/springcore/ref/configRef.xml");
		A aObj=(A)context.getBean("aref");
		B bObj=(B)context.getBean("bref");
		System.out.println(aObj.getX());
		System.out.println(bObj.getY());
		System.out.println(aObj);
	}

}
