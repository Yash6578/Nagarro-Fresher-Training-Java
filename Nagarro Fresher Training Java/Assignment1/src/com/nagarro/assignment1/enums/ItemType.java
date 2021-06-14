package com.nagarro.assignment1.enums;

public enum ItemType {
	RAW(1),
	MANUFACTURED(2),
	IMPORTED(3);
	
	private int itemType;
	
	private ItemType(int itemType)
	{
		this.itemType = itemType;
	}
	
	public int getItemType()
	{
		return this.itemType;
	}
}
