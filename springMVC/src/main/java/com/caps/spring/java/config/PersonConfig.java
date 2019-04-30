package com.caps.spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Bean(name="person")
	public Person getPerson(Job job) {
		Person p = new Person();
		p.setName("Prash");
		p.setJob(job);
		return p;
	}
	
	@Bean
	public Job getJob() {
		return new SoftwareTester();
	}
}
