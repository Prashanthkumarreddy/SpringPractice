package com.caps.spring.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(PersonConfig.class);
        Person p = ctx.getBean(Person.class,"person");
        p.getJob().doJob();
        ctx.close();
    }
}
