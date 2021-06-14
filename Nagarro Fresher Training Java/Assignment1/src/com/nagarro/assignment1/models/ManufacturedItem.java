package com.nagarro.assignment1.models;

import com.nagarro.assignment1.constants.*;
import com.nagarro.assignment1.enums.*;

public class ManufacturedItem extends Item {

	public ManufacturedItem(String itemName, int itemType, int price, int quantity) {
		super(itemName, itemType, price, quantity);
		// TODO Auto-generated constructor stub
		setTaxRate(Constants.MANUFACTURED_TAX_RATE);
	}
	
	public ManufacturedItem() {
		super("Default", ItemType.MANUFACTURED.getItemType(), 0, 0);
		// TODO Auto-generated constructor stub
		setTaxRate(Constants.MANUFACTURED_TAX_RATE);
	}
	

	@Override
	public void calcFinalPrice() {
		// TODO Auto-generated method stub
		double temp = this.taxRate * this.price;
		this.salesTax = temp + Constants.SURCHARGE_MANUFACTURED * (this.price + temp);
		this.finalPrice = this.salesTax + this.price;
		this.totalPrice = this.finalPrice * this.quantity;
	}

}
