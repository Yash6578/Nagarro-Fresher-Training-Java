package com.nagarro.assignment1.cart;

import com.nagarro.assignment1.linklist.*;
import com.nagarro.assignment1.models.Item;

public class Calculator {
	public static void calculateCart(Cart c) {
		ListIterator<Item> it = c.itemList.iterator();
		
		while(it.hasNext()) {
			Item i = it.next();
			i.calcFinalPrice();
			c.total += i.getTotalPrice();
		}
	}
}
