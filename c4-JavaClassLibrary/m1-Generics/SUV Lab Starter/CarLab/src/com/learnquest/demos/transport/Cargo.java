package com.learnquest.demos.transport;

public abstract class Cargo extends Car {
	public Cargo() {
		super();
	}

	public Cargo(String name) {
		super(name);
	}

	public Cargo(String name, int speed, int fuel, boolean running) {
		super(name, speed, fuel, running);
	}

	@Override
	public void setSpeed(int newSpeed) {
		super.setSpeed(newSpeed - getCurrentCargoLoad() / 100);
	}

	public void setCurrentCargoLoad(int currentCargoLoad) {
		this.currentCargoLoad = currentCargoLoad;
	}

	public int getCurrentCargoLoad() {
		return currentCargoLoad;
	}

	private int cargoCapacity;
	private int currentCargoLoad;

}