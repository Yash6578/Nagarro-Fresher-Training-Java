package com.nagarro.assignment1.input;

import java.util.*;
import com.nagarro.assignment1.models.*;

public class InputTaker {
	public static Item inputItem(Scanner sc)
	{
		String name = "";
		int price = 0, quantity = 0, type = 0;
		Item i;
		
		do {
			try {
					
					System.out.println("Enter Details of Item-");
					System.out.println("Enter Item Name");
					name = sc.nextLine();
					
					System.out.println("Enter Item Type (1->Raw | 2->Manufactured | 3->Imported)");
					type = sc.nextInt();
					
					System.out.println("Enter Item Price");
					price = sc.nextInt();
					
					System.out.println("Enter Item Quantity");
					quantity = sc.nextInt();
					
					if(InputValidator.isValidItemType(type)) {
						break;
					}
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input try again");
				sc.nextLine();
				continue;
			}
		
		}while(true);
		
		i = ItemFactory.getInstance(type);
		i.instantiate(name,type,price,quantity);
	
		return i;
	}
	
	
	
}
