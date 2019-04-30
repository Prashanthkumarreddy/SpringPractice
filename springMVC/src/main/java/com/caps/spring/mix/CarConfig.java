package com.caps.spring.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	@Bean(name="car")
	public Car getCar(Engine engine) {
		Car c = new Car();
		c.setBrand("Nano");
		c.setColor("Gold");
		c.setEngine(engine);
		return c;
	}
	
	@Bean(name="engine")
	public Engine getEngine() {
		Engine e = new Engine();
		e.setModel("SnapDragon V8");
		return e;
	}
}
