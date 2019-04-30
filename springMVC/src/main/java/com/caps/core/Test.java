package com.caps.core;

public class Test {
	public static void main(String[] args) {
		Person  p=new Person();
		p.setName("prash");
		
		SoftwareDeveloper job=new SoftwareDeveloper();
		p.setJob(job);
		p.getJob().doJob();
	}

}
