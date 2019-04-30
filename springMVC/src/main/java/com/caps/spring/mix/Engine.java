package com.caps.spring.mix;

public class Engine {
	private String model;
	
	public void start() {
		System.out.println("Start");
	}
	
	public void stop() {
		System.out.println("Stop");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}
}
