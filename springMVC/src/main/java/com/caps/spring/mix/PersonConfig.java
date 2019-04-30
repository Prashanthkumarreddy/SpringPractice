package com.caps.spring.mix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Autowired(required=true)
	Job job;
	
	
	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Blake");
		p.setJob(job);
		return p;
	}
	
	@Bean(name="job")
	public Job getJob() {
		return new SoftwareDeveloper();
	}
}
