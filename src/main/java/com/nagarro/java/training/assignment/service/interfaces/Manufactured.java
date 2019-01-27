package com.nagarro.java.training.assignment.service.interfaces;

import com.nagarro.java.training.assignment.dlo.Item;
import com.nagarro.java.training.assignment.validation.Type;
/**
 *class Manufactured used to calculate tax if type is manufactured
 *
 */
public class Manufactured extends Item implements ItemServices{

	public Manufactured(String name,Type type,double price,int quantity)
	{
		super(name,type,price,quantity);
		calculateTax();
	}

	public void calculateTax() {
		double tax1 = (0.125 * price);
		tax = (0.02) * (tax1 + price);
		totalPrice = (tax + price) * quantity;
		setTax(tax);
		setTotalPrice(totalPrice);
	}

}
