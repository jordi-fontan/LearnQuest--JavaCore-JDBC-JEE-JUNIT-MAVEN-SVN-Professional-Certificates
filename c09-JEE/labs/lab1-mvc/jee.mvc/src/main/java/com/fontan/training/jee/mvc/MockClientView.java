package com.fontan.training.jee.mvc;

import java.util.HashMap;

public class MockClientView {
	
	private static Controller ctr;
	public void addContact(long id, String fn, String ln) {
		ctr.addContact(id, fn, ln);
	}
	public Contact displayFirst(long id) {
		return ctr.getContact(id);
	}
	public static void main(String[] xxxxxx)
	{
		LocalRepository myLr=new LocalRepository(new HashMap<Long,Contact>());
		ctr=new Controller(myLr);
		ctr.addContact(1, "Deimis", "Bebesita");
		ctr.addContact(2, "Jordi", "Papasito");
		String frase=(ctr.getContact(1)).toString() + " Ama a " + 
		(ctr.getContact(2)).toString();
		System.out.println(frase);
	}

}
