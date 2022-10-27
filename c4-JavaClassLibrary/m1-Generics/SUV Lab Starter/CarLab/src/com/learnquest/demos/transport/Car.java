package com.learnquest.demos.transport;

import java.time.LocalDate;
import java.time.Period;

import static java.lang.Math.min;

public class Car {

	public Car() { }

	public Car(String name)
	{
		// this(name, 0, 0, false);	// Can't use this if we don't want to declare SpeedException
		this(name, 0, false);
	}

	public Car(String name, int speed, int fuel, boolean running)
	{
		this(name, 0, false);
		setSpeed(speed);
	}

	private Car(String name, int fuel, boolean running) {
		setName(name);
		setGasoline(fuel);
		setEngineState(running);
	}

	/*
	public void setTirePressures(int[] pressures)
	{
		
	}
	*/
	
	public void setTirePressures(int ... pressures)
	{
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getGasoline() {
		return gasoline;
	}

	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}

	public boolean isEngineState() {
		return engineState;
	}

	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}

	private int gasoline;
	private boolean engineState;
	
	private LocalDate manufactured;
	
	public LocalDate getManufactured() {
		return manufactured;
	}

	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}

	public int getAge() {
		return Period.between(getManufactured(), LocalDate.now()).getYears();
	}
}
