package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/CiConfig.xml");
		Person person=(Person) context.getBean("Person");
		System.out.println(person);
		Addition add=(Addition)context.getBean("add");		add.doSum();
	}

}
