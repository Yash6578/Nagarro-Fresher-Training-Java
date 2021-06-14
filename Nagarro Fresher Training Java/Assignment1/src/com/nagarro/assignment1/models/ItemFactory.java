package com.nagarro.assignment1.models;

import com.nagarro.assignment1.enums.*;

public class ItemFactory {
	public static Item getInstance(int type)
	{
		if(ItemType.RAW.getItemType() == type)
		{
			return new RawItem();
		}
		else if(ItemType.MANUFACTURED.getItemType() == type) {
			return new ManufacturedItem();
		}
		else if(ItemType.IMPORTED.getItemType() == type) {
			return new ImportedItem();
		}
		
		return null;
	}
}
