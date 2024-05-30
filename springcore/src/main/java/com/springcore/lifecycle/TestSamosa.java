package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/configLifecycle.xml");
		Samosa s1=(Samosa)context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook();//checks if destroy method is there
	}

}
