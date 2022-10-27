package com.learnquest.demos.transport;

public class SportsCar extends Car {
	public SportsCar() {
	}

	public SportsCar(String name) {
		super(name);
	}

	public SportsCar(String name, int speed, int fuel, boolean running) {
		super(name, speed, fuel, running);
	}

	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed((int) (newSpeed * 1.10));
	}
}
