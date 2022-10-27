package com.javaoo.store.drivers;

import java.util.Date;

import com.javaoo.store.Artist;
import com.javaoo.store.Book;
import com.javaoo.store.CD;
import com.javaoo.store.ClassicalCD;
import com.javaoo.store.Inventory;
import com.javaoo.store.Item;

public class InventoryDriver {
	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		
		// Add some books to Inventory
		myInventory[0] = new Book("Godzilla on Holiday", 24.95, 5, "Wesley Wynham-Price", "Ransom House", "FICTION");
		myInventory[1] = new Book("Loch Ness Memories", 49.95, 1, "Fred MacMurray", "Penquin Press", "FICTION");
		myInventory[2] = new Book("MVS JCL", 89.95, 3, "Steve Balmer", "Microsoft Press", "NON-FICTION");
		myInventory[3] = new Book("Lingo in a Nutshell", 19.95, 8, "Bill Bates", "O'Reilly", "NON-FICTION");
		myInventory[4] = new Book("Grid Computing", 79.95, 2, "Bobby Beowold", "Trouser Press", "NON-FICTION");

		// Add some CDs
		myInventory[5] = new CD("Going For The One", 12.95, 4, new Artist("YES"), new Date("07/07/1977"));
		myInventory[6] = new CD("Going Down The Country", 12.95, 10, new Artist("Bozos"), new Date("09/07/1987"));
		myInventory[7] = new CD("Polka Favorites", 2.95, 4, new Artist("Jimmy and the Yuppers"), new Date("07/07/1955"));
		
		myInventory[8] = new ClassicalCD("Romeo and Juliet", 22.95, 1, "Joe Green", new String[] {"Henry", "Elizabeth", "Franz", "Arther"}, "New York", new Date("01/01/2001"));
		myInventory[9] = new ClassicalCD("A Romp in The Park", 22.95, 3, "Beethoven", new String[] {"Vivaldi", "Johnson", "Arturo", "Wenselaus"}, "Hamburg", new Date("01/01/2001"));

		Inventory.produceReport(myInventory);
	}
}
