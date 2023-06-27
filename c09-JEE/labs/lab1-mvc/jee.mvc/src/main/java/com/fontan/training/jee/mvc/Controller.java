package com.fontan.training.jee.mvc;

public class Controller {
	private LocalRepository lr;
	public Controller(LocalRepository lr)
	{
		this.lr=lr;
	}
	public void addContact(long id, String firstName,String lastName) {
		lr.addContact(id, firstName, lastName);
	}
	public Contact getContact(long id) {
		return lr.getContact(id);
		
	}
}
