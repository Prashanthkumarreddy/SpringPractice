package com.caps.core;

public class Person {
	private String name;
	private SoftwareDeveloper job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SoftwareDeveloper getJob() {
		return job;
	}
	public void setJob(SoftwareDeveloper job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}

}
