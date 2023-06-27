package com.fontan.training.jee.mvc;

import java.util.HashMap;
import java.util.Map;

public class LocalRepository {
		private Map<Long,Contact> map;

		public LocalRepository(HashMap<Long, Contact> hashMap) {
			super();
			this.map = hashMap;
		}
		
		public void addContact(long id, String fn, String ln) {
			 if (map!=null)  map.put(id, new Contact(id,fn,ln));
			 else System.out.println("null map");
		}
		public Contact getContact(long id) {
			 if (map!=null) return (Contact) map.get(id);
			 else System.out.println("null map");
			 return null;
		}
}
