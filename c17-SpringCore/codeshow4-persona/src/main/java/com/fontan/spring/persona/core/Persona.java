package com.fontan.spring.persona.core;

public class Persona {
 private long id;
 public long getId() {
	return id;
}
public String getName() {
	return name;
}
public Address getAddress() {
	return address;
}
public Persona(long id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
private String name;
 private Address address;

}
