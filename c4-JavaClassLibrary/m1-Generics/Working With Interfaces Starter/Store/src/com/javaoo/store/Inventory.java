package com.javaoo.store;

public class Inventory {

	public static void produceReport(Item[] items) {
		int totalItems = 0;
		double totalPrice = 0.0;
		
		System.out.println("Inventory System Report\n");
		for (Item item: items) {
			if (item == null) break;
			System.out.printf("Title: %-30s, Price: $%6.2f, Quantity: %2d%n", item.getTitle(), item.getPrice(), item.getQuantity());
			totalItems += item.getQuantity();
			totalPrice += item.getQuantity() * item.getPrice();
		}
		System.out.printf("%nTotal Items: %d, Total Price: $%.2f%n", totalItems, totalPrice);
	}

}
