package com.nagarro.assignment1.input;

import com.nagarro.assignment1.enums.*;

public class InputValidator {
	public static boolean isValidItemType(int itemType) {
		
		if(itemType == ItemType.RAW.getItemType() || 
		itemType == ItemType.MANUFACTURED.getItemType() || 
		itemType == ItemType.IMPORTED.getItemType()) {
			return true;
		}
		System.out.println("Incorrect item type");
		return false;
	}
}
