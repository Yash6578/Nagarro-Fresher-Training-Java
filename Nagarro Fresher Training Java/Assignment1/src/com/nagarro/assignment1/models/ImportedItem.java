package com.nagarro.assignment1.models;

import com.nagarro.assignment1.constants.*;
import com.nagarro.assignment1.enums.ItemType;

public class ImportedItem extends Item {

	public ImportedItem(String itemName, int itemType, int price, int quantity) {
		super(itemName, itemType, price, quantity);
		// TODO Auto-generated constructor stub
		setTaxRate(Constants.IMPORTED_TAX_RATE);
	}
	
	public ImportedItem() {
		super("Default", ItemType.IMPORTED.getItemType(), 0, 0);
		// TODO Auto-generated constructor stub
		setTaxRate(Constants.IMPORTED_TAX_RATE);
	}

	@Override
	public void calcFinalPrice() {
		// TODO Auto-generated method stub
		double tempTax = this.price * this.taxRate;
		
		if(100 >= this.price + tempTax)
		{
			this.salesTax = tempTax + Constants.SURCHARGE_IMPORTED_PRICE;
		}
		else if(200 >= this.price + tempTax)
		{
			this.salesTax = tempTax + Constants.SURCHARGE_IMPORTED_PRICE * 2;
		}
		else
		{
			this.salesTax = tempTax + Constants.SURCHARGE_IMPORTED_PERCENT * (this.price + tempTax);
		}
		
		this.finalPrice = this.salesTax + this.price;
		this.totalPrice = this.finalPrice * this.quantity;
	}

}
