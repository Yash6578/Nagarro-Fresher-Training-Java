package com.nagarro.assignment1.models;

import com.nagarro.assignment1.constants.*;
import com.nagarro.assignment1.enums.ItemType;

public class RawItem extends Item {

	public RawItem(String itemName, int itemType, int price, int quantity) {
		super(itemName, itemType, price, quantity);
		// TODO Auto-generated constructor stub
		setTaxRate(Constants.RAW_TAX_RATE);
	}
	
	public RawItem() {
		super("Default", ItemType.RAW.getItemType(), 0, 0);
		// TODO Auto-generated constructor stub
		setTaxRate(Constants.RAW_TAX_RATE);
	}

	@Override
	public void calcFinalPrice() {
		// TODO Auto-generated method stub
		this.salesTax = this.taxRate * this.price;
		this.finalPrice = this.salesTax + this.price;
		this.totalPrice = this.finalPrice * this.quantity;
	}
	
}
