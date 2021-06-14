package com.nagarro.assignment1.models;

public abstract class Item {
	protected String itemName;
	protected int price, quantity, itemType;
	protected double taxRate,salesTax,finalPrice,totalPrice; 
	
	public Item(String itemName, int itemType, int price, int quantity) {
		this.itemName = itemName;
		this.itemType = itemType;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String toString() {
		return String.format("%-14s%-15d%-25.2f%-25.2f%-14d%-15.2f",itemName,price,salesTax,finalPrice,quantity,totalPrice);
	}
	
	public void instantiate(String name,int type,int price,int quantity) {
		this.itemName = name;
		this.itemType = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	public abstract void calcFinalPrice();
}
