package com.learnquest.demos.transport;

public class StationWagon extends Cargo {
	
	public StationWagon() {
	}

	public StationWagon(String name) {
		super(name);
	}

	public StationWagon(String name, int speed, int fuel, boolean running) {
		super(name, speed, fuel, running);
	}
}
