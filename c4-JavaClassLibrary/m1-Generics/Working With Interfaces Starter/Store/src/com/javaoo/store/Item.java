package com.javaoo.store;

public class Item {
	private String title;
	private double price;
	private int quantity;
	
	public Item(String title, double price, int quantity) {
		setTitle(title);
		setPrice(price);
		setQuantity(quantity);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
