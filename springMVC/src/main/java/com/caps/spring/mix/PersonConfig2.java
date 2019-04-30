package com.caps.spring.mix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig2 {
	
	@Autowired(required=true)
	Job job;
	
	
	@Bean(name="person2")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Blake");
		p.setJob(job);
		return p;
	}
	
	@Bean(name="job2")
	public Job getJob() {
		return new SoftwareTester();
	}
}
