package com.nagarro.assignment1.controller;

import java.util.Scanner;
import com.nagarro.assignment1.models.*;
import com.nagarro.assignment1.input.*;
import com.nagarro.assignment1.cart.*;


public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart c = new Cart();
		Item i;
		char flag = 'n';
		try(Scanner sc = new Scanner(System.in);) {
			do {
				i = InputTaker.inputItem(sc);
				c.add(i);
				
				System.out.println("Want to enter more items if yes press Y / y");
				flag = sc.next().charAt(0);
				sc.nextLine();
			}while('y' == flag || 'Y' == flag);
			
			Calculator.calculateCart(c);
			c.display();
		}

	}
}