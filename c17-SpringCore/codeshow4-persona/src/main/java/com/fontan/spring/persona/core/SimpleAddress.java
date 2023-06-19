package com.fontan.spring.persona.core;

public class SimpleAddress implements Address {
	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public String getZip() {
		return zip;
	}

	private long id;
	private String street;
	private String zip;
	private int floor;
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	private String door;
	
	public SimpleAddress(long id, String street, String zip) {
		super();
		this.id = id;
		this.street = street;
		this.zip = zip;
	}
	
}
