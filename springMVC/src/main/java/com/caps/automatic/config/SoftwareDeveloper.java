package com.caps.automatic.config;

import org.springframework.stereotype.Component;

@Component
public class SoftwareDeveloper implements Job {
  public void doJob() {
	  System.out.println("code code code");
  }
}
