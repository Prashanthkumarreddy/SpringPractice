package com.caps.spring.java.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person  {
	private String name;
	private Job job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	@PostConstruct
	public void doSomethng() {
		System.out.println("hellooooooooooo");
	}
	@PreDestroy
	public void destroyBean() {
		System.out.println("byeeee");
	}

}
