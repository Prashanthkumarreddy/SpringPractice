package com.caps.automatic.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.caps.core.SoftwareDeveloper;

public class Test {
	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(PersonConfig.class);
		
		Person p =ctx.getBean(Person.class,"person");
		
		p.getJob().doJob();
		ctx.close();
		
		
	
		
		
	}

}
