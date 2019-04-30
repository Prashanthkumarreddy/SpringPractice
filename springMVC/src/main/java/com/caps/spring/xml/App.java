package com.caps.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext ctx = 
    		   new ClassPathXmlApplicationContext("/PersonConfig.xml");
    	
       Person p = ctx.getBean(Person.class,"person");
       p.getJob().doJob();
       
    }
}