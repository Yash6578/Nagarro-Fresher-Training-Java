package com.nagarro.assignment1.cart;

import com.nagarro.assignment1.linklist.*;
import com.nagarro.assignment1.models.*;
import java.util.Arrays;

public class Cart {
	protected LinkList<Item> itemList;
	protected double total;
	
	public Cart() {
		itemList = new LinkList<Item>();
		total = 0;
	}
	
	public void add(Item i) {
		itemList.addToTail(i);
	}
	
	public void display() {
		ListIterator<Item> it = itemList.iterator();
		
		char[] array = new char[106];
	    Arrays.fill(array, '-');
	    
		System.out.printf("\n\n%-14s%-15s%-25s%-25s%-14s%-15s\n","Name","Price","Sales tax liability","Final Price per item","Quantity","Total Price");
		
		while(it.hasNext())
		{	
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println(array);
		System.out.printf("%-93s%-15.2f","Total",total);
	}
}
