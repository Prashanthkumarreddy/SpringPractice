package com.caps.automatic.config;

import org.springframework.stereotype.Component;


public class SoftwareTester implements Job {

	@Override
	public void doJob() {
		System.out.println("test test test");
		
	}
	
	

}
