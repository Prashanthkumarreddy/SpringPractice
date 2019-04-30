package com.caps.spring.mix;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx =
    			new AnnotationConfigApplicationContext(Config.class);
    	
    	for(String bean: ctx.getBeanDefinitionNames()) {
    		System.out.println(bean);
    	}
    	ctx.close();
    }
}
