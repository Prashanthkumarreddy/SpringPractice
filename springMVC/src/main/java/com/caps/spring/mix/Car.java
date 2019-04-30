package com.caps.spring.mix;

public class Car {
	
	private String brand;
	private String color;
	private Engine engine;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", engine=" + engine + "]";
	}
	
}
