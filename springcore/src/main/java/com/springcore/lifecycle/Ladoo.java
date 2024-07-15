package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Ladoo {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Ladoo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ladoo [subject=" + subject + "]";
	}
	@PostConstruct //this is annotation for init method
	public void start() {
		System.out.println("Starting method:");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method||");
	}
	
}
