package com.caps.spring.mix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({PersonConfig.class, CarConfig.class})
@ImportResource({"classpath:bookConfig.xml"})
public class Config {
	
}
