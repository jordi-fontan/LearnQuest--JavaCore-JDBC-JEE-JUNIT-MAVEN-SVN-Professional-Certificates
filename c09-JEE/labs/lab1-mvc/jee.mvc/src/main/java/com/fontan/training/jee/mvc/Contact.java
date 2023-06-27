package com.fontan.training.jee.mvc;

public class Contact {
	private long id;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public Contact(long id2, String fn, String ln) {
		this.id=id2;
		this.first_name=fn;
		this.last_name=ln;
	}
	
	private String first_name;
	private String last_name;
	
	
	@Override
	public String toString() {
		return  first_name + "," +last_name;
	}
}
