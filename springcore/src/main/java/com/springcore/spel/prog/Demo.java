package com.springcore.spel.prog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+11}")
	private int x;
	
	@Value("#{43+66}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")//Spring expression language used to call static methods
	private double z;
	
	@Value("#{new java.lang.String('Manoj Khanvalkar') }")//used to create object
	private String name;
	
	@Value("#{44<34}")//how to insert boolean value in the variable using SPEL
	private boolean isActive;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", name=" + name + ", isActive=" + isActive + "]";
	}
	
	
	
	
	
}
