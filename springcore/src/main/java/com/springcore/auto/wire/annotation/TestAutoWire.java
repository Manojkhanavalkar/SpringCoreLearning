package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoConfig.xml");
		Emp emp1=context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}
}
